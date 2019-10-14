package com.example.pr1_caha.Model;

import java.util.ArrayList;

public class Gallery {
    private int galleryId;
    private String galleryName;
    ArrayList<Photo> photos = new ArrayList<>();

    public Gallery(int galleryId,String galleryName, ArrayList photos){
        this.galleryId = galleryId;
        this.galleryName = galleryName;
        this.photos = photos;
    }

    public void generateGallery(){
        // TODO:
    }

    public void editGallery(){
        // TODO:
    }

    public void uploadPhoto(){
        // TODO:
    }

    public void displayPhoto(Photo photo){
        // TODO:
    }

    public void deletePhoto(Photo photo, Gallery gallery){
        // TODO:
    }


}
