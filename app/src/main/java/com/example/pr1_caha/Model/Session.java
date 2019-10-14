package com.example.pr1_caha.Model;

public class Session {
    private User user;

    public Session(User user) {
        this.user = user;
    }


    public User getUserID(){
        return user;
    }

    public void setUserID(User user) {
        this.user = user;
    }
}