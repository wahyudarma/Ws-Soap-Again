package com.wahyu.model;

import java.io.Serializable;
public class Negara implements Serializable
{
    private int id;
    private String namaNegara;
    private long populasi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaNegara() {
        return namaNegara;
    }

    public void setNamaNegara(String namaNegara) {
        this.namaNegara = namaNegara;
    }

    public long getPopulasi() {
        return populasi;
    }

    public void setPopulasi(long populasi) {
        this.populasi = populasi;
    }
}
