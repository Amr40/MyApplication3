package com.example.gggg;

public class Place {

    private String mPlaceName;

    private int mImageResourceID;

    private int mImageResource2ID;

    public Place(String placeName, int imageResourceID) {
        mPlaceName = placeName;
        mImageResourceID = imageResourceID;
    }
    public Place(String placeName, int imageResourceID,int imageResource2ID) {
        mPlaceName = placeName;
        mImageResourceID = imageResourceID;
        mImageResource2ID = imageResource2ID;
    }


    public String getPlaceName() {
        return mPlaceName;
    }

    public  int getImageResourceID() {
        return mImageResourceID;
    }

    public  int getImageResource2ID() {
        return mImageResource2ID;
    }
}