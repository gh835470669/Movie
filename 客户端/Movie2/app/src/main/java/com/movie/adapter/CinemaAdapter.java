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
import com.movie.items.CinemaItem;
import com.movie.items.MovieItem;
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
public class CinemaAdapter extends BaseAdapter {
    private Context context;
    private List<CinemaItem> list;

    public CinemaAdapter(Context _context, List<CinemaItem> _list) {
        list = _list;
        context = _context;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_cinema, null);
            viewholder = new ViewHolder();
            viewholder.name = (TextView)convertView.findViewById(R.id.name);
            viewholder.addr = (TextView)convertView.findViewById(R.id.addr);
            viewholder.price = (TextView)convertView.findViewById(R.id.price);
            viewholder.distance = (TextView) convertView.findViewById(R.id.distance);
            viewholder.textViews = new TextView[6];
            int[] ids = {R.id.seat,R.id.change,R.id.eat,R.id._3d,R.id.imax,R.id.discount};
            for (int k = 0; k < ids.length; ++k) {
                viewholder.textViews[k] = (TextView)convertView.findViewById(ids[k]);
            }
            convertView.setTag(viewholder);
        } else {
            convertView = view;
            viewholder = (ViewHolder)convertView.getTag();
        }
        viewholder.name.setText(list.get(i).getName());
        viewholder.distance.setText(((int)(list.get(i).getDistance()*100))/100.0+"km");
        viewholder.price.setText(list.get(i).getPrice()+"");
        viewholder.addr.setText(list.get(i).getAddr());
        for (int j = 0; j < viewholder.textViews.length; ++j) {
            viewholder.textViews[j].setVisibility(View.GONE);
        }
        for (int j = 0; j < list.get(i).getLabel().size(); ++j) {
            viewholder.textViews[list.get(i).getLabel().get(j)].setVisibility(View.VISIBLE);
        }

        return convertView;
    }

    private class ViewHolder {
        public TextView name;
        public TextView addr;
        public TextView price;
        public TextView distance;
        public TextView[] textViews;
    }
}
