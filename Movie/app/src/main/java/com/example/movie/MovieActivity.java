package com.example.movie;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MovieActivity extends AppCompatActivity {
    private ArrayList<Movie> movies;
    private ArrayList<Movie> searchResults;
    private Button search;
    private TextView searchContent;
    private ListView lv;

    private MyMovieAdaptor myMovieAdaptor;
    private MyMovieAdaptor searchResultsMovieAdaptor;

    private void getMovies() {
        movies = new ArrayList<>();

        Movie movie = new Movie();
        movie.setId(0);
        movie.setName("Titanic");
        movie.setScore(9.9f);
        movie.setIntroduction("不得了");
        movies.add(movie);

        movie = new Movie();
        movie.setId(1);
        movie.setName("Big Bang");
        movie.setScore(9.9f);
        movie.setIntroduction("还是不得了");
        movies.add(movie);
    }

    private class MyMovieAdaptor extends BaseAdapter {
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
            ViewHolder viewHolder;

            if (view == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.movie_listview_item, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.name = (TextView)convertView.findViewById(R.id.movie_listview_name);
                viewHolder.icon = (ImageView) convertView.findViewById(R.id.movie_listview_icon);
                viewHolder.score = (TextView)convertView.findViewById(R.id.movie_listview_score);
                viewHolder.introduction = (TextView)convertView.findViewById(R.id.movie_listview_intro);
                convertView.setTag(viewHolder);

            } else {
                convertView = view;
                viewHolder = (ViewHolder)convertView.getTag();
            }

            Movie m = list.get(position);
            viewHolder.name.setText(m.getName());
            viewHolder.score.setText(String.valueOf(m.getScore()));
            viewHolder.introduction.setText(m.getIntroduction());
            //viewHolder.icon

            return convertView;
        }

        public class ViewHolder {
            public ImageView icon;
            public TextView name;
            public TextView score;
            public TextView introduction;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        getMovies();
        searchResults = new ArrayList<Movie>();

        searchContent = (TextView)findViewById(R.id.movie_searchContent);
        search = (Button)findViewById(R.id.movie_searchButton);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = searchContent.getText().toString();
                if (content.isEmpty()) return;

                searchResults.clear();
                for (int i = 0; i < movies.size(); i++) {
                    if (movies.get(i).getName().contains(content)) {
                        Log.d("d", movies.get(i).getName());
                        searchResults.add(movies.get(i));
                    }
                }
                lv.setAdapter(searchResultsMovieAdaptor);
            }
        });

        lv = (ListView) findViewById(R.id.movie_listview);
        myMovieAdaptor = new MyMovieAdaptor(this, movies);
        searchResultsMovieAdaptor = new MyMovieAdaptor(this, searchResults);
        lv.setAdapter(myMovieAdaptor);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MovieActivity.this, MovieInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("movie", movies.get(position));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
