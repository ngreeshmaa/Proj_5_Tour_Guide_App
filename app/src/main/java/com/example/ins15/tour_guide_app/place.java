package com.example.ins15.tour_guide_app;

public class place  {
    private int mPlaceImage;
    private String mPlaceName;

    public place(int PlaceImage, String PlaceName) {
        mPlaceImage = PlaceImage;
        mPlaceName = PlaceName;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public int getmPlaceImage() {
        return mPlaceImage;
    }
}
