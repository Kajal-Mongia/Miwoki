package com.example.miwoki;

public class Word {
    private String miwokiTranslation;
    private String defaultTranslation;
    private int imageResID= NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED =-1;

    Word(String d, String m){
        miwokiTranslation=m;
        defaultTranslation=d;
    }
    Word(String d,String m,int resID){
        miwokiTranslation=m;
        defaultTranslation=d;
        imageResID=resID;
    }

    String getMiwokiTranslation(){
        return miwokiTranslation;
    }

    String getDefaultTranslation(){
        return defaultTranslation;
    }

    int getImageResID(){return imageResID;}

    boolean hasImage(){
        if(imageResID== NO_IMAGE_PROVIDED)
            return false;
        else
            return true;
    }
}
