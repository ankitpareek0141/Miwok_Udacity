package com.example.miwok_udacity;

public class Word {

    private String english;
    private String miwok;
    private int imageId;
    private int audioResourceId;

    public Word(String english, String miwok) {
        this.english = english;
        this.miwok = miwok;
    }

    public Word(String english, String miwok, int imageId, int audioResourceId){
        this.english = english;
        this.miwok = miwok;
        this.imageId = imageId;
        this.audioResourceId = audioResourceId;
    }

    public String getMiwok() {
        return miwok;
    }

    public String getEnglish() {
        return english;
    }

    public int getImageId() {
        return imageId;
    }

    public int getAudioResourceId(){
        return audioResourceId;
    }

}
