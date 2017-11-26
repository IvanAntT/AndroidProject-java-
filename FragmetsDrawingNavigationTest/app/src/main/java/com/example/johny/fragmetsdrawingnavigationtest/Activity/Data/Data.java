package com.example.johny.fragmetsdrawingnavigationtest.Activity.Data;

import com.example.johny.fragmetsdrawingnavigationtest.Activity.Models.Film;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johny on 13-Sep-17.
 */

public class Data {
    private static ArrayList<Film> films;

    static {

        films = new ArrayList<Film>();


        films.add(new Film("Titanik","Ivan",1993));
        films.add(new Film("Black","Petur",1931));
        films.add(new Film("Iron man","Johny",1893));
        films.add(new Film("Avengers","Victor",1996));
        films.add(new Film("Arrow","Stoqn",1995));
        films.add(new Film("Naruto","AnimeF",1991));
    }

    public List<Film> getFilms(){
        return  new ArrayList<>(films);
    }

    public Film getFilmByName(String name)
    {
        for (Film cFilm:films) {
            if(cFilm.getName().equals(name))
            {
                return cFilm;
            }
        }

        return null;
    }

    public Film createFilm(String name, String rejisor, int godina){

        Film newFilm = new Film(name,rejisor,godina);

        films.add(newFilm);

        return newFilm;
    }
}
