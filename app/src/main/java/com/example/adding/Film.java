package com.example.adding;

public class Film {
    String nom;
    String realisateur;
    String date;

    public Film(String nom, String realisateur, String date) {
        this.nom = nom;
        this.realisateur = realisateur;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
