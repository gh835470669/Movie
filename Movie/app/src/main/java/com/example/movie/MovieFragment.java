package com.example.movie;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 黄健军 on 2017/6/9.
 */

public class MovieFragment extends Fragment {
    // Store instance variables
    private ArrayList<Movie> movies;
    private ListView lv;
    private MyMovieAdaptor myMovieAdaptor;
    private RelativeLayout search;

    public static class MyMovieAdaptor extends BaseAdapter {
        private Context context;
        private ArrayList<Movie> list;

        public MyMovieAdaptor(Context context, ArrayList<Movie> list) {
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
            MyMovieAdaptor.ViewHolder viewHolder;

            if (view == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.movie_listview_item, parent, false);
                viewHolder = new MyMovieAdaptor.ViewHolder();
                viewHolder.name = (TextView)convertView.findViewById(R.id.movie_listview_name);
                viewHolder.icon = (ImageView) convertView.findViewById(R.id.movie_listview_icon);
                viewHolder.score = (TextView)convertView.findViewById(R.id.movie_listview_score);
                viewHolder.introduction = (TextView)convertView.findViewById(R.id.movie_listview_intro);
                viewHolder.tagOf23D = (TextView)convertView.findViewById(R.id.movie_listview_tag23D);
                convertView.setTag(viewHolder);

            } else {
                convertView = view;
                viewHolder = (MyMovieAdaptor.ViewHolder)convertView.getTag();
            }

            Movie m = list.get(position);
            viewHolder.name.setText(m.getName());
            viewHolder.score.setText(String.valueOf(m.getScore()));
            viewHolder.introduction.setText(m.getIntroduction());
            viewHolder.tagOf23D.setText(m.getTagOf23D());
            //viewHolder.icon

            return convertView;
        }

        public class ViewHolder {
            public ImageView icon;
            public TextView name;
            public TextView score;
            public TextView introduction;
            public TextView tagOf23D;
        }
    }

    private void getMovies() {
        movies = new ArrayList<>();
        ArrayList<String> tags;

        Movie movie = new Movie();
        tags = new ArrayList<>();
        tags.add("动作");
        tags.add("恋爱");
        movie.setId(0);
        movie.setName("Titanic");
        movie.setScore(9.9f);
        movie.setIntroduction("不得了");
        movie.setTagOf23D("3D");
        movie.setTags(tags);
        movies.add(movie);

        movie = new Movie();
        tags= new ArrayList<>();
        tags.add("动作");
        tags.add("冒险");
        movie.setId(1);
        movie.setName("Big Bang");
        movie.setScore(9.9f);
        movie.setIntroduction("还是不得了");
        movie.setTagOf23D("3D");
        movie.setTags(tags);
        movies.add(movie);

        movie = new Movie();
        tags= new ArrayList<>();
        tags.add("动作");
        tags.add("冒险");
        tags.add("恋爱");
        movie.setId(2);
        movie.setName("Cat and Mouse");
        movie.setScore(9.0f);
        movie.setIntroduction("十分不得了");
        movie.setTagOf23D("2D");
        movie.setTags(tags);
        movies.add(movie);

        movie = new Movie();
        tags = new ArrayList<>();
        tags.add("动作");
        tags.add("冒险");
        tags.add("什么鬼");
        movie.setId(3);
        movie.setName("Wind");
        movie.setScore(7.9f);
        movie.setIntroduction("还是不得了");
        movie.setTagOf23D("2D");
        movie.setTags(tags);
        movies.add(movie);
    }

    // newInstance constructor for creating fragment with arguments
    public static MovieFragment newInstance() {
        MovieFragment movieFragment = new MovieFragment();
        Bundle args = new Bundle();
        movieFragment.setArguments(args);
        return movieFragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getMovies();
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);

         search = (RelativeLayout)view.findViewById(R.id.searchmovie_search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieFragment.this.getContext(), MovieSearchActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("movies", movies);
                intent.putExtras(bundle);
                intent.putExtra("act", "main");
                startActivity(intent);
            }
        });

        lv = (ListView)view.findViewById(R.id.searchmovie_listview);
        myMovieAdaptor = new MyMovieAdaptor(this.getContext(), movies);
        lv.setAdapter(myMovieAdaptor);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MovieFragment.this.getContext(), MovieInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("movie", movies.get(position));
                intent.putExtras(bundle);
                intent.putExtra("act", "main");
                startActivity(intent);
            }
        });
        return view;
    }
}
