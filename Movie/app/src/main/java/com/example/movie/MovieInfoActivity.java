package com.example.movie;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MovieInfoActivity extends AppCompatActivity {
    private Movie m_movie;
    private TextView name;
    private TextView score;
    private ImageView icon;
    private TextView onDate;
    private TextView introduction;
    private TextView tags;
    private ListView lv;

    private ArrayList<Comment> comments;

    private void setMovieInfo() {
        name.setText(m_movie.getName());
        score.setText(String.valueOf(m_movie.getScore()));
        introduction.setText(m_movie.getIntroduction());
        String _tags = new String();
        ArrayList<String> strings = m_movie.getTags();
        for (int i = 0; i < strings.size(); i++) {
            _tags += strings.get(i);
            _tags += " ";
        }
        _tags += m_movie.getTagOf23D();
        tags.setText(_tags);
    }

    private void setComments() {
        int id = m_movie.getId();

        //get comments by movie id

        comments = new ArrayList<>();
        Comment comment = new Comment();
        comment.setCommenter("路人A");
        comment.setScore(8.0f);
        comment.setContent("不得了不得了不得了不得了不得了不得了不得了");
        Date date = new Date();
        date.setYear(2017);
        date.setMonth(1);
        date.setDate(1);
        comment.setDate(date);
        comments.add(comment);

        comment = new Comment();
        comment.setCommenter("路人B");
        comment.setScore(9.0f);
        comment.setContent("不得了不得了不得了不得了不得了不得了不得了不得了不得了不得了不得了不得了不得了不得了");
        date = new Date();
        date.setYear(2017);
        date.setMonth(1);
        date.setDate(2);
        comment.setDate(date);
        comments.add(comment);

    }

    private class Comment {
        private String commenter;
        private String avatar;
        private String content;
        private float score;
        private Date date;

        public String getCommenter() {
            return commenter;
        }

        public void setCommenter(String commenter) {
            this.commenter = commenter;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public float getScore() {
            return score;
        }

        public void setScore(float score) {
            this.score = score;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

    private class MyCommentAdaptor extends BaseAdapter {
        private Context context;
        private ArrayList<Comment> list;

        public MyCommentAdaptor(Context context, ArrayList<Comment> list) {
            this.context = context;
            this.list = list;
        }

        @Override
        public int getCount() {
            if (list == null) {
                return  0;
            }
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            if (list == null) {
                return null;
            }
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {

            View convertView;
            ViewHolder viewHolder;

            if (view == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.comment_listview_item, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.name = (TextView)convertView.findViewById(R.id.comment_listview_name);
                viewHolder.icon = (ImageView) convertView.findViewById(R.id.comment_listview_icon);
                viewHolder.score = (TextView)convertView.findViewById(R.id.comment_listview_score);
                viewHolder.content = (TextView)convertView.findViewById(R.id.comment_listview_content);
                viewHolder.date = (TextView)convertView.findViewById(R.id.comment_listview_date);
                convertView.setTag(viewHolder);

            } else {
                convertView = view;
                viewHolder = (ViewHolder)convertView.getTag();
            }

            Comment comment = list.get(position);
            viewHolder.name.setText(comment.getCommenter());
            viewHolder.score.setText(String.valueOf(comment.getScore()));
            viewHolder.content.setText(comment.getContent());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String t=format.format(comment.getDate());
            viewHolder.date.setText(t);
            //viewHolder.icon

            return convertView;
        }

        public class ViewHolder {
            public ImageView icon;
            public TextView name;
            public TextView score;
            public TextView content;
            public TextView date;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);

        name = (TextView)findViewById(R.id.movieInfo_name);
        score = (TextView)findViewById(R.id.movieInfo_score);
        icon = (ImageView)findViewById(R.id.movieInfo_icon);
        onDate = (TextView)findViewById(R.id.movieInfo_onDate);
        introduction = (TextView)findViewById(R.id.movieInfo_intro);
        tags = (TextView)findViewById(R.id.movieInfo_tags);

        Bundle b = getIntent().getExtras();
        this.m_movie = b.getParcelable("movie");

        setMovieInfo();
        setComments();

        lv = (ListView) findViewById(R.id.movieInfo_comments_listview);
        MyCommentAdaptor myCommentAdaptor = new MyCommentAdaptor(this, comments);
        lv.setAdapter(myCommentAdaptor);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Bundle b = getIntent().getExtras();
        if (b != null) {
            Movie movie = (Movie)b.getParcelable("movie");
            Log.d("d", "onResume: " + movie.getName());
            if (movie != null) {
                this.m_movie = movie;
                setMovieInfo();
            } else {
                Log.d("d", "onResume: userdatas are null");
            }
        }
    }
}
