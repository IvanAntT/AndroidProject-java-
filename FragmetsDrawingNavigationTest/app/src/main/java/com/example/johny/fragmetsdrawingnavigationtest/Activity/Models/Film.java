package com.example.johny.fragmetsdrawingnavigationtest.Activity.Models;

import java.io.Serializable;

/**
 * Created by Johny on 13-Sep-17.
 */

public class Film implements Serializable{

    private String name;
    private String rejisior;
    private int godina;

    public Film(String name, String rejisor, int godina) {
        this.name = name;
        this.rejisior = rejisor;
        this.godina = godina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRejisior() {
        return rejisior;
    }

    public void setRejisior(String rejisior) {
        this.rejisior = rejisior;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }


}
