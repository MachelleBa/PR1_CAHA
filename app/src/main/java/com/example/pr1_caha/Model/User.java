package com.example.pr1_caha.Model;

//let op, Gallery en Image zijn bestaande android classes!
//TODO: add imports

import android.widget.Gallery;

public class User {

    private int userId;
    private String userName;
    private String userTag;
    private Photo userIcon;

    private Gallery gallery;

    //TODO: user doesn't need to know which session they have, change it in the CD!

    public User(int id) {

        this.userId = id;

       //TODO: make this gallery generation work!

       // this.gallery = new Gallery();
    }

    //Deze constructer wordt gebruikt op het moment dat een user wordt aangemaakt, of geen icon heeft gekozen
    public User(int id, String name, String tag, Gallery gallery) {

        this.userId = id;
        this.userName = name;
        this.userTag = tag;
        this.gallery = gallery;

        //TODO: voeg hier een standaard icon aan toe, dmv een methode!
      //  this.userIcon = standaardIcon
    }

    //Deze constructor hebben we nodig op het moment dat de user vanuit het JSON file een icon heeft
    public User(int id, String name, String tag, Photo icon, Gallery gallery){

        this.userId = id;
        this.userName = name;
        this.userTag = tag;
        this.gallery = gallery;
        this.userIcon = icon;
    }

    public void showGallery() {

        //genereer hier de lijst met fotos

        //roep hier de juiste controller aan, geef lijst met fotos mee.

    }

    public void editName() {


       // this.userName = input;
    }

    public void changeUserIcon() { //Dit is correct, maar moet eigenlijk even aangepast worden in CD


        //this.userIcon = image;
    }

    public void loginUser() {

        //vraag hier de gegevens en vergelijk ze met de users in het JSON bestand, log dan in en maak een session aan

    }
}
