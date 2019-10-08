package com.example.pr1_caha.Model;

import java.util.Date;

public class Comment {

    private String content;
    private static int maxCharacters;
    private User user;
    private Date placementTime;

    public Comment(String content, int maxCharacters, User user, Date placementTime){
        this.content = content;
        this.maxCharacters = maxCharacters;
        this.user = user;
        this.placementTime = placementTime;
    }

    public String getContent(){
        return content;
    }

    public static int getMaxCharacters() {
        return maxCharacters;
    }

    public User getUser(){
        return user;
    }

    public Date getPlacementTime(){
        return placementTime;
    }

    public void placeComment(){

    }
}
