package com.example.pr1_caha.Model;

import java.util.ArrayList;

public class Gallery {
    private int galleryId;
    private String galleryName;
    private ArrayList<Photo> photos = new ArrayList<>();

    public Gallery(int galleryId,String galleryName, ArrayList photos){
        this.galleryId = galleryId;
        this.galleryName = galleryName;
        this.photos = photos;
    }

    public Gallery(int galleryId, String galleryName){
        this.galleryId = galleryId;
        this.galleryName = galleryName;
    }

    public ArrayList<Photo> generateGallery(){
        return this.photos;
    }

    //editGallery doesn't have a purpose in life.
    /*
    public void editGallery(){

    }*/

    public void uploadPhoto(Photo photo){
        this.photos.add(photo);
    }

    public Photo displayPhoto(Photo photo){
        return photo.getPhoto();
    }

    public void deletePhoto(Photo photo, Gallery gallery){
        gallery.photos.remove(photo);
    }
}
