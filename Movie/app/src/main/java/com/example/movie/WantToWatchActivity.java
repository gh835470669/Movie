package com.example.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WantToWatchActivity extends AppCompatActivity {
    private ArrayList<Movie> movies;
    private ListView lv;
    private MovieFragment.MyMovieAdaptor myMovieAdaptor;

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
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_want_to_watch);

        Bundle bundle = getIntent().getExtras();
        getMovies();

        lv = (ListView)findViewById(R.id.wtw_lv);
        myMovieAdaptor = new MovieFragment.MyMovieAdaptor(this, movies);
        lv.setAdapter(myMovieAdaptor);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(WantToWatchActivity.this, MovieInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("movie", movies.get(position));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


}
