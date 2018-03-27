package com.engim.alfonso.myapplication.models;

/**
 * Created by Alfonso-LAPTOP on 27/03/2018.
 */

public class Rifornimento {

    private String nomeBenzinaio;
    private double importo;

    public Rifornimento(String nome, Double importo){
        this.nomeBenzinaio = nome;
        this.importo = importo;
    }

    public Rifornimento(){

    }

    public String getNomeBenzinaio() {
        return nomeBenzinaio;
    }

    public void setNomeBenzinaio(String nomeBenzinaio) {
        this.nomeBenzinaio = nomeBenzinaio;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }
}
