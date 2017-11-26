package com.example.johny.fragmetsdrawingnavigationtest.Activity.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.johny.fragmetsdrawingnavigationtest.Activity.DetailFilm;
import com.example.johny.fragmetsdrawingnavigationtest.Activity.MainActivity;
import com.example.johny.fragmetsdrawingnavigationtest.Activity.Data.Data;
import com.example.johny.fragmetsdrawingnavigationtest.Activity.Models.Film;
import com.example.johny.fragmetsdrawingnavigationtest.R;

import java.io.Serializable;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFilm extends Fragment {

    public Data data;

    public ListFilm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_list_film, container, false);

        this.data = new Data();

        //Взимане на лист вюто
        ListView lvFilm = (ListView) root.findViewById(R.id.lv_ListWithFilms);

        //Взимане на списък с филмите
        List<Film> listWithFilms = data.getFilms();

        ArrayAdapter<Film> arrayFilmAdapter = new ArrayAdapter<Film>(root.getContext(),-1,listWithFilms){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view =convertView;
                if(view == null)
                {
                    LayoutInflater inflater = LayoutInflater.from(this.getContext());
                    view = inflater.inflate(R.layout.film_item,parent,false);
                }

                TextView tvTitle = (TextView) view.findViewById(R.id.tv_FilmName);

                tvTitle.setText(this.getItem(position).getName());

                return view;
            }
        };

        lvFilm.setOnItemClickListener((parent, view, position, id) -> {

            Intent intent = new Intent(this.getContext(),DetailFilm.class);

            Film film = listWithFilms.get(position);

            intent.putExtra(DetailFilm.FILM_KEY, film);

            this.startActivity(intent);
                }
        );

        lvFilm.setAdapter(arrayFilmAdapter);

        return root;
    }

}
