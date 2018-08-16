package com.example.ins15.tour_guide_app;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class PlacesFragment extends Fragment {

    public PlacesFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<place> places = new ArrayList<place>();
        places.add(new place(R.drawable.dummy, "ABC"));
        places.add(new place(R.drawable.dummy, "ABC"));
        places.add(new place(R.drawable.dummy, "ABC"));
        places.add(new place(R.drawable.dummy, "ABC"));

        placesAdapter adapter = new placesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }

}
