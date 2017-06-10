package com.example.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MovieSearchActivity extends AppCompatActivity {
    private ArrayList<Movie> searchRes;
    private ArrayList<Movie> movies;
    private ListView lv;
    private MovieFragment.MyMovieAdaptor myMovieAdaptor;
    private EditText searchContent;

    private void getMovies() {
        Intent intent = getIntent();
        if (intent == null) return;
        if (intent.getStringExtra("act") == null) return;
        if (intent.getStringExtra("act").equals("main")) {
            movies = intent.getExtras().getParcelableArrayList("movies");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_search);

        getMovies();

        searchContent = (EditText)findViewById(R.id.searchmovie_searchContent);
        searchContent.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                searchRes.clear();
                for (int i = 0; i < movies.size(); i++) {
                    if (s.toString().isEmpty()) break;
                    if (movies.get(i).getName().contains(s.toString())) {
                        searchRes.add(movies.get(i));
                    }
                }
                myMovieAdaptor.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        lv = (ListView)findViewById(R.id.searchmovie_listview);
        searchRes = new ArrayList<>();
        myMovieAdaptor = new MovieFragment.MyMovieAdaptor(this, searchRes);
        lv.setAdapter(myMovieAdaptor);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MovieSearchActivity.this, MovieInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("movie", movies.get(position));
                intent.putExtras(bundle);
                intent.putExtra("act", "main");
                startActivity(intent);
            }
        });
    }
}
