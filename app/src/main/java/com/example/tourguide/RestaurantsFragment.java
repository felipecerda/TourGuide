package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<CityItem> attractions = new ArrayList<CityItem>();

        attractions.add(new CityItem(getString(R.string.restaurant_name_1), getString(R.string.restaurant_address_1)));
        attractions.add(new CityItem(getString(R.string.restaurant_name_2), getString(R.string.restaurant_address_2)));
        attractions.add(new CityItem(getString(R.string.restaurant_name_3), getString(R.string.restaurant_address_3)));
        attractions.add(new CityItem(getString(R.string.restaurant_name_4), getString(R.string.restaurant_address_4)));
        attractions.add(new CityItem(getString(R.string.restaurant_name_5), getString(R.string.restaurant_address_5)));
        attractions.add(new CityItem(getString(R.string.restaurant_name_6), getString(R.string.restaurant_address_6)));
        attractions.add(new CityItem(getString(R.string.restaurant_name_7), getString(R.string.restaurant_address_7)));
        attractions.add(new CityItem(getString(R.string.restaurant_name_8), getString(R.string.restaurant_address_8)));

        CityItemAdapter adapter = new CityItemAdapter(getActivity(), attractions, R.color.clear_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
