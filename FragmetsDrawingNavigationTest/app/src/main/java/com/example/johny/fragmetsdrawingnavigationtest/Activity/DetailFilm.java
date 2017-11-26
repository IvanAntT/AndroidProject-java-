package com.example.johny.fragmetsdrawingnavigationtest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.johny.fragmetsdrawingnavigationtest.Activity.Fragments.DetailFilms;
import com.example.johny.fragmetsdrawingnavigationtest.Activity.Models.Film;
import com.example.johny.fragmetsdrawingnavigationtest.R;

public class DetailFilm extends AppCompatActivity {

    public static final String FILM_KEY = "Film";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_film);

        Intent myIntent =this.getIntent();

        Film myFilm = (Film)myIntent.getSerializableExtra(FILM_KEY);

        DetailFilms fragmentToDetaill = (DetailFilms) getSupportFragmentManager()
                .findFragmentById(R.id.frag_Details);

        fragmentToDetaill.setData(myFilm);
    }
}
