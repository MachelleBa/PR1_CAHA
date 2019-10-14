package com.example.pr1_caha.Model;

import java.util.ArrayList;


public class Sentence {
    private String sentence;
    private static ArrayList<Sentence> SentencesList;

    //Sentence constructor
    //TODO Define ArrayList
    public Sentence(String sentence, ArrayList<Sentence> sentencesList) {
        this.sentence = sentence;
    }

    //TODO The Sentence has to be update every 24 hours
    private void updateSentence(){
    }

    //TODO get the sentence to add to gallery of just to display
    public String getSentence() {
        return sentence;
    }

    //getting the gallery that is connected to the sentence
    public String getGallery() {
        return null;
    }

}
