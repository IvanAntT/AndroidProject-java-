package com.example.johny.workshopui.Data;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by Johny on 10-Oct-17.
 */

public class Food implements Serializable{

    private String name;
    private String urlSnimka;
    private int calorii;


    public Food(String name, String urlSnimka, int calorii)
    {
        this.setName(name);
        this.setSnimkaURL(urlSnimka);
        this.setCalorii(calorii);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnimkaURL() {
        return urlSnimka;
    }

    public void setSnimkaURL(String snimkaURL) {
        this.urlSnimka = snimkaURL;
    }

    public int getCalorii() {
        return calorii;
    }

    public void setCalorii(int calorii) {
        this.calorii = calorii;
    }
}
