package com.example.tourguide;

public class CityItem {

    // Name of the attraction
    private String mName;

    // Address of the attraction
    private String mAddress;

    // ID of the image resource
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this item
    private static final int NO_IMAGE_PROVIDED = -1;

    // Constructor for the items without image
    public CityItem(String name, String address){
        mName = name;
        mAddress = address;
    }

    // Constructor for the items with image
    public CityItem(String name, String address, int imageResourceID){
        mName = name;
        mAddress = address;
        mImageResourceID = imageResourceID;
    }

    // Get the name of the city item
    public String getName() {
        return mName;
    }

    // Get the address of the city item
    public String getAddress() {
        return mAddress;
    }

    // Get the resource id of the city item
    public int getImageResourceID() {
        return mImageResourceID;
    }

    // Returns whether or not there is an image for this item
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}
