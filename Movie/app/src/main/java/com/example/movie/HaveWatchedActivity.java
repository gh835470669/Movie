package com.example.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HaveWatchedActivity extends AppCompatActivity {
    private ArrayList<Movie> movies;
    private ListView lv;
    private MovieFragment.MyMovieAdaptor myMovieAdaptor;

    private void getMovies() {
        movies = new ArrayList<>();
        ArrayList<String> tags;

        Movie movie = new Movie();
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_have_watched);

        Bundle bundle = getIntent().getExtras();
        getMovies();

        lv = (ListView)findViewById(R.id.hw_lv);
        myMovieAdaptor = new MovieFragment.MyMovieAdaptor(this, movies);
        lv.setAdapter(myMovieAdaptor);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HaveWatchedActivity.this, MovieInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("movie", movies.get(position));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
