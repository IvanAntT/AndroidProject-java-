package com.example.johny.fragmetsdrawingnavigationtest.Activity.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.johny.fragmetsdrawingnavigationtest.Activity.Data.Data;
import com.example.johny.fragmetsdrawingnavigationtest.Activity.Models.Film;
import com.example.johny.fragmetsdrawingnavigationtest.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFilms extends Fragment {

    public DetailFilms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detail_films, container, false);

        // Inflate the layout for this fragment
        return root;
    }


    public void setData(Film myFilm) {

        View currentView = this.getView();

        TextView tvName =(TextView) currentView.findViewById(R.id.tv_detailName);

        TextView tvRejisior =(TextView) currentView.findViewById(R.id.tv_detailRejisior);

        TextView tvGodina =(TextView) currentView.findViewById(R.id.tv_detailGodina);


        tvName.setText(myFilm.getName());

        tvRejisior.setText(myFilm.getRejisior());

        tvGodina.setText(Integer.toString(myFilm.getGodina()));


    }
}
