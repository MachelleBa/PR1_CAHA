package com.example.pr1_caha.Model;

//let op, Gallery en Image zijn bestaande android classes!
//TODO: add imports

public class User {

    private int userId;
    private String userName;
    private String userTag;
    private Photo userIcon;

    public User(int id) {

        this.userId = id;
    }

    //Deze constructer wordt gebruikt op het moment dat een user wordt aangemaakt, of geen icon heeft gekozen
    public User(int id, String name, String tag) {

        this.userId = id;
        this.userName = name;
        this.userTag = tag;

        //TODO: voeg hier een standaard icon aan toe, dmv een methode!
      //  this.userIcon = standaardIcon
    }

    //Deze constructor hebben we nodig op het moment dat de user vanuit het JSON file een icon heeft
    public User(int id, String name, String tag, Photo icon){

        this.userId = id;
        this.userName = name;
        this.userTag = tag;
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
}
