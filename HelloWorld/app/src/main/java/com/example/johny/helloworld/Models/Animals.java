package com.example.johny.helloworld.Models;

/**
 * Created by Johny on 11-Sep-17.
 */

public class Animals {
    private int id;
    private String name;
    private String poroda;
    private int age;

    public Animals(int id,String name,String poroda, int age)
    {
        this.setId(id);
        this.setName(name);
        this.setPoroda(poroda);
        this.setAge(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
