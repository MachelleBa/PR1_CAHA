package com.example.pr1_caha.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class Photo extends AppCompatActivity{

    private ImageView mimageView;
    private static final int REAQUEST_IMAGE_CAPTURE = 101;
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

    public void takePicture(View view)
    {
        Intent imageTakeIntent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);

        if(imageTakeIntent.resolveActivity(getPackageManager())!=null)
        {
            startActivityForResult(imageTakeIntent, REAQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REAQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            mimageView.setImageBitmap(imageBitmap);
        }

    }
}
