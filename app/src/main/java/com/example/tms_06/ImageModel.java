package com.example.tms_06;

public class ImageModel{
    private String imageurl;

    public ImageModel(){
    }

    public ImageModel(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
