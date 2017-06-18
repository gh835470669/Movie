package com.movie.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.movie.R;
import com.movie.items.CinemaItem;
import com.movie.items.MovieShowTimeItem;

import java.util.List;

/**
 * Created by ljm on 2017/6/17.
 */
public class MovieShowTimeAdapter extends BaseAdapter {
    private Context context;
    private List<MovieShowTimeItem> list;

    public MovieShowTimeAdapter(Context _context, List<MovieShowTimeItem> _list) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_showtime, null);
            viewholder = new ViewHolder();
            viewholder.start = (TextView)convertView.findViewById(R.id.start);
            viewholder.end = (TextView)convertView.findViewById(R.id.end);
            viewholder.price = (TextView)convertView.findViewById(R.id.price);
            viewholder.lang = (TextView) convertView.findViewById(R.id.lang);
            viewholder.hall = (TextView) convertView.findViewById(R.id.hall);
            viewholder.buy = (Button)convertView.findViewById(R.id.buy);

            convertView.setTag(viewholder);
        } else {
            convertView = view;
            viewholder = (ViewHolder)convertView.getTag();
        }
        viewholder.start.setText(list.get(i).getStart());
        viewholder.end.setText(list.get(i).getEnd()+"散场");
        viewholder.price.setText(list.get(i).getPrice()+"元");
        viewholder.lang.setText(list.get(i).getLanguage()+list.get(i).get_3D());
        viewholder.hall.setText(list.get(i).getHall());

        viewholder.buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buyCallback != null) {
                    buyCallback.buy(i);
                }
            }
        });

        return convertView;
    }

    public interface BuyCallback{
        void buy(int pos);
    }
    private BuyCallback buyCallback;
    public void setBuyCallback(BuyCallback callback) {
        buyCallback = callback;
    }

    private class ViewHolder {
        public TextView start;
        public TextView end;
        public TextView lang;
        public TextView hall;
        public TextView price;
        public Button buy;
    }
}
