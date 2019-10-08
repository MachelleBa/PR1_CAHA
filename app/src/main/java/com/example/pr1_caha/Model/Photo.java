package com.example.pr1_caha.Model;

import java.util.function.ToDoubleBiFunction;

import static com.example.pr1_caha.Model.Enumerations.photoType.jpeg;
import static com.example.pr1_caha.Model.Enumerations.photoType.jpg;

public class Photo {
    private String photoName;
    private Enumerations photoType;
    private long photoSize;
    private static long maxPhotoSize = 0;
    private static int standardHeight = 0;
    private static int standardWidth = 0;
    int[] standardSize = new int[]{standardWidth,standardHeight};
    private String fileLocation;

    public Photo(String PhotoName, Enumerations photoType, long photoSize ,String fileLocation){
        this.photoName = photoName;
        this.photoType = photoType;
        this.photoSize = photoSize;
        this.fileLocation = fileLocation;
    }

    public Photo getPhoto(){
      return null;

    }

    public Ranking getPhotoRanking(){
        return null;
    }

    public Enumerations getPhotoType() {
        return photoType;
    }

    public long getMaxPhotoSize(){
        return 0;
    }

    public void getStandardSize() {
        // TODO: 8-10-2019 return a standard size ;
    }

    public String getFileLocation(){
        return fileLocation;
    }

    public void downloadPhoto(String fileLocation){
        // TODO: 8-10-2019 fill in the function
    }

    public void sharePhoto(Photo photo){
        // TODO: 8-10-2019 fill in the function
    }
}
