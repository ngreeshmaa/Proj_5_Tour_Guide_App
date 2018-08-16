package com.example.ins15.tour_guide_app;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class placesAdapter extends ArrayAdapter<place> {
    public placesAdapter(Activity context, ArrayList<place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places_layout, parent, false);
        }

        place currentplace = getItem(position);

        TextView placeName = (TextView) listItemView.findViewById(R.id.placeName);
        placeName.setText(currentplace.getmPlaceName());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.placeImage);
        imageView.setImageResource(currentplace.getmPlaceImage());
        return listItemView;
    }
}

