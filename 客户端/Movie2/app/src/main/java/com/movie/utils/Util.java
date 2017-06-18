package com.movie.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.movie.R;
import com.movie.activity.MainActivity;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

/**
 * Created by ljm on 2017/6/17.
 */
public class Util {
    private static Toast toast;

    public static void setToast(Context context, String msg) {
        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
            toast.show();
        } else {
            toast.setText(msg);
        }
    }

    public static double getDouble(double n) {
        return ((int)(n*100))/100.0;
    }

    public static void showStatusBar(Activity activity){
        WindowManager.LayoutParams attrs = activity.getWindow().getAttributes();
        attrs.flags &= ~WindowManager.LayoutParams.FLAG_FULLSCREEN;
        activity.getWindow().setAttributes(attrs);

        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    private Bitmap blur(Bitmap bitmap, View view, Context context) {
        // 把 bitmap的尺寸缩小到原图的1/8 这时候bitmap在模糊处理过程中先被缩小然再放大
        float scaleFactor = 8;
        float radius = 3;
        Bitmap overlayBmp = Bitmap.createBitmap((int) (view.getMeasuredWidth() / scaleFactor),
                (int) (view.getMeasuredHeight() / scaleFactor), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(overlayBmp);
        canvas.translate(-view.getLeft() / scaleFactor, -view.getTop() / scaleFactor);
        canvas.scale(1 / scaleFactor, 1 / scaleFactor);
        Paint paint = new Paint();
        // 这里bitmap缩放时 加FILTER_BITMAP_FLAG会更加顺畅
        paint.setFlags(Paint.FILTER_BITMAP_FLAG);
        canvas.drawBitmap(bitmap, 0, 0, paint);
        // 通过 RenderScript 调用底层接口来实现高斯模糊计算
        RenderScript rs = RenderScript.create(context);
        Allocation overlayAlloc = Allocation.createFromBitmap(rs, overlayBmp);
        // 有个缺点那就是 ScriptIntrinsicBlur只支持API17以上
        ScriptIntrinsicBlur blur = ScriptIntrinsicBlur.create(rs, overlayAlloc.getElement());
        blur.setInput(overlayAlloc);
        blur.setRadius(radius);
        blur.forEach(overlayAlloc);
        overlayAlloc.copyTo(overlayBmp);
        rs.destroy();
        return overlayBmp;
    }

    private static ImageLoader imageLoader;
    public static void load_img(Context context, final ImageView imageView, final String url) {
        imageView.setTag(url);
        if (imageLoader == null) {
            DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                    .cacheInMemory(true).cacheOnDisc(true).build();
            ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context.getApplicationContext())
                    .defaultDisplayImageOptions(defaultOptions)
                    .memoryCache(new LruMemoryCache(12 * 1024 * 1024))
                    .memoryCacheSize(12 * 1024 * 1024)
                    .discCacheSize(32 * 1024 * 1024).discCacheFileCount(100)
                    .threadPriority(Thread.NORM_PRIORITY - 2)
                    .denyCacheImageMultipleSizesInMemory()
                    .diskCacheFileNameGenerator(new Md5FileNameGenerator())
                    .tasksProcessingOrder(QueueProcessingType.LIFO)
                    .writeDebugLogs()
                    .build();
            ImageLoader.getInstance().init(config);

            imageLoader = ImageLoader.getInstance();
        }


        imageLoader.displayImage(url, imageView, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String s, View view) {
                imageView.setImageResource(R.mipmap.default_img);
            }
            @Override
            public void onLoadingFailed(String s, View view, FailReason failReason) {
                imageView.setImageResource(R.mipmap.default_img);
            }
            @Override
            public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                if (url.equals(imageView.getTag())) {
                    imageView.setImageBitmap(bitmap);
                }
            }
            @Override
            public void onLoadingCancelled(String s, View view) {
                //finalHolder.img_goods.setImageResource(R.mipmap.zhanwei0);
            }
        });
    }
}
