package com.example.gggg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.gggg.R;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<com.example.gggg.Place> places = new ArrayList<com.example.gggg.Place>();

        // Add to an array new objects with the data
        places.add(new com.example.gggg.Place(getString(R.string.monument_to_empress_catherine_ii),
                R.drawable.monument_to_empress_catherine_ii));
        places.add(new com.example.gggg.Place(getString(R.string.monument_to_shurik_and_lidochka),
                R.drawable.monument_to_shurik_and_lidochka));
        places.add(new com.example.gggg.Place(getString(R.string.monument_to_the_purse),
                R.drawable.monument_to_the_purse));
        places.add(new com.example.gggg.Place(getString(R.string.monument_sobachkina_stolica),
                R.drawable.monument_sobachkina_stolica));
        places.add(new com.example.gggg.Place(getString(R.string.monument_to_man_the_creator),
                R.drawable.monument_to_man_the_creator));
        places.add(new com.example.gggg.Place(getString(R.string.monument_to_suvorov), R.drawable.monument_to_suvorov));
        places.add(new com.example.gggg.Place(getString(R.string.monument_of_st_catherine_the_great_martyr),
                R.drawable.monument_of_st_catherine_the_great_martyr));
        places.add(new com.example.gggg.Place(getString(R.string.monument_to_the_cossacks),
                R.drawable.monument_to_the_cossacks));
        places.add(new com.example.gggg.Place(getString(R.string.generation_connection),
                R.drawable.generation_connection));

        // Inflate current View object in places_list.xml
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        com.example.gggg.PlaceAdapter placeAdapter = new com.example.gggg.PlaceAdapter(getActivity(), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;
    }
}