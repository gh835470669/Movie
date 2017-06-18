package com.movie.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.movie.R;
import com.movie.items.CinemaItem;
import com.movie.items.CommentItem;
import com.movie.utils.Util;

import java.util.List;

/**
 * Created by ljm on 2017/6/17.
 */
public class CommentAdapter extends BaseAdapter {
    private Context context;
    private List<CommentItem> list;

    public CommentAdapter(Context _context, List<CommentItem> _list) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_comment, null);
            viewholder = new ViewHolder();
            viewholder.user_name = (TextView)convertView.findViewById(R.id.user_name);
            viewholder.user_icon = (ImageView) convertView.findViewById(R.id.user_icon);
            viewholder.score = (TextView)convertView.findViewById(R.id.score);
            viewholder.comment = (TextView) convertView.findViewById(R.id.comment);
            viewholder.approve = (TextView) convertView.findViewById(R.id.approve);
            viewholder.date = (TextView) convertView.findViewById(R.id.date);

            convertView.setTag(viewholder);
        } else {
            convertView = view;
            viewholder = (ViewHolder)convertView.getTag();
        }
        viewholder.user_name.setText(list.get(i).getName());
        viewholder.score.setText(((int)(list.get(i).getScore()*100))/100.0+"");
        viewholder.comment.setText(list.get(i).getContent()+"");
        viewholder.date.setText(list.get(i).getTime());
        viewholder.approve.setText(list.get(i).getApprove()+"");
        viewholder.user_icon.setTag(list.get(i).getImage());
        Util.load_img(context, viewholder.user_icon, list.get(i).getImage());

        return convertView;
    }

    private class ViewHolder {
        public TextView user_name;
        public ImageView user_icon;
        public TextView score;
        public TextView comment;
        public TextView date;
        public TextView approve;
    }
}
