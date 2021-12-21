package com.example.android_1_dz4;

public class Model {
        private int Img;
        private String Country;
        private String kg;
        private int id;

    public Model(int img, String country, String kg, int id) {
        Img = img;
        Country = country;
        this.kg = kg;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public String getEurasia() {
        return Country;
    }

    public void setEurasia(String eurasia) {
        Country = eurasia;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public Model(int img, String country, String kg) {
        Img = img;
        Country = country;
        this.kg = kg;
    }
}
