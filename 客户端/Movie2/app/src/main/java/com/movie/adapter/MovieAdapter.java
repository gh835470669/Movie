package com.movie.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.movie.R;
import com.movie.items.MovieItem;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import java.util.List;

/**
 * Created by ljm on 2017/6/17.
 */
public class MovieAdapter extends BaseAdapter {
    private Context context;
    private List<MovieItem> list;
    private ImageLoader imageLoader;

    public MovieAdapter(Context _context, List<MovieItem> _list) {
        list = _list;
        context = _context;

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

    @Override
    public int getCount(){
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override
    public Object getItem(int i){
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        final ViewHolder viewholder;
        View convertView;
        if (view == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_movie, null);
            viewholder = new ViewHolder();
            viewholder.name = (TextView)convertView.findViewById(R.id.name);
            viewholder.image = (ImageView)convertView.findViewById(R.id.image);
            viewholder._3d = (TextView)convertView.findViewById(R.id._3d);
            viewholder.imax = (TextView) convertView.findViewById(R.id.imax);
            viewholder.describe = (TextView) convertView.findViewById(R.id.describe);
            viewholder.showInfo = (TextView) convertView.findViewById(R.id.showInfo);
            viewholder.score = (TextView) convertView.findViewById(R.id.score);
            viewholder.buy = (Button)convertView.findViewById(R.id.buy);
            convertView.setTag(viewholder);
        } else {
            convertView = view;
            viewholder = (ViewHolder)convertView.getTag();
        }
        viewholder.name.setText(list.get(i).getName());
        viewholder.score.setText(list.get(i).getScore()+"");
        viewholder.describe.setText(list.get(i).getDescribe());
        viewholder.showInfo.setText(list.get(i).getShowInfo());
        //imageLoader.displayImage(list.get(i).getImage(), viewholder.image);
        viewholder.image.setTag(list.get(i).getImage());
        imageLoader.displayImage(list.get(i).getImage(), viewholder.image, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String s, View view) {
                viewholder.image.setImageResource(R.mipmap.default_img);
            }
            @Override
            public void onLoadingFailed(String s, View view, FailReason failReason) {
                viewholder.image.setImageResource(R.mipmap.default_img);
            }
            @Override
            public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                if (list.get(i).getImage().equals(viewholder.image.getTag())) {
                    viewholder.image.setImageBitmap(bitmap);
                }
            }
            @Override
            public void onLoadingCancelled(String s, View view) {
                //finalHolder.img_goods.setImageResource(R.mipmap.zhanwei0);
            }
        });
        if (list.get(i).get_3d()) {
            viewholder._3d.setText("3D");
        } else {
            viewholder._3d.setText("2D");
        }
        if (list.get(i).getimax()) {
            viewholder.imax.setVisibility(View.VISIBLE);
        } else {
            viewholder.imax.setVisibility(View.GONE);
        }

        viewholder.buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buyCallback != null) buyCallback.buy(i);
            }
        });

        return convertView;
    }

    private class ViewHolder {
        public ImageView image;
        public TextView name;
        public TextView _3d;
        public TextView imax;
        public TextView score;
        public TextView describe;
        public TextView showInfo;
        public Button buy;
    }

    public interface BuyCallback{
        void buy(int pos);
    }
    private BuyCallback buyCallback;
    public void setBuyCallback(BuyCallback callback) {
        buyCallback = callback;
    }
}
