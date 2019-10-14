package com.example.pr1_caha.Model;

import android.view.Menu;

import com.example.pr1_caha.Model.Sentence;

import java.util.ArrayList;

public class Page {

    private String pageName;
    private String pageXMLFile;
    private String pageJavaFile;
    private String pageContent;
    private Sentence dailySentence;
 //   private Session session;  error, daarom commented
    private ArrayList<Menu> menus;



    public Page(String name) {

        //maak hier een if-statement aan, op het moment dat er een bepaalde page wordt aangeroepen
        //vul hier de properties naar behoren (in het if-statement)

        loadPage(this);


    }

    private void loadPage(Page page) {

        //roep hier de juiste controller aan, gebaseerd op de naam van de pagina

    }

/**   private Sentence getDailySentence() {

 
        return this.sentence;
    }
**/

    private void updateDailySentence() {

        //gebruik dit om de zin te updated, doe dit met behulp van een Klok

    }

}
