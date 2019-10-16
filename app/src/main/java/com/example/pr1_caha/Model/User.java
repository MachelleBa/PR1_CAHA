package com.example.pr1_caha.Model;

//let op, Gallery en Image zijn bestaande android classes!
//TODO: add imports



import java.util.ArrayList;

public class User {

    private int userId;
    private String userName;
    private String userTag;
    private Photo userIcon;
    private Gallery gallery;


    //TODO: user doesn't need to know which session they have, change it in the CD!

    public User(int id, Gallery gallery) {

        this.userId = id;
        this.gallery = new com.example.pr1_caha.Model.Gallery(this.userId, this.userName);
    }

    //Deze constructer wordt gebruikt op het moment dat een user wordt aangemaakt, of geen icon heeft gekozen
    public User(int id, String name, String tag, Gallery gallery, Photo userIcon) {

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

    }

    public void editName() {

        this.userName = userName;

    }

    public void changeUserIcon() { //Dit is correct, maar moet eigenlijk even aangepast worden in CD


        this.userIcon = userIcon;

    }

    public void loginUser() {

        //vraag hier de gegevens en vergelijk ze met de users in het JSON bestand, log dan in en maak een session aan




    }
}
