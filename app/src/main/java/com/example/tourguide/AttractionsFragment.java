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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<CityItem> attractions = new ArrayList<CityItem>();

        attractions.add(new CityItem(getString(R.string.attraction_name_1), getString(R.string.attraction_address_1), R.drawable.att_dom));
        attractions.add(new CityItem(getString(R.string.attraction_name_2), getString(R.string.attraction_address_2), R.drawable.hohenzollern_bridge));
        attractions.add(new CityItem(getString(R.string.attraction_name_3), getString(R.string.attraction_address_3), R.drawable.cologne_4711));
        attractions.add(new CityItem(getString(R.string.attraction_name_4), getString(R.string.attraction_address_4), R.drawable.farina));
        attractions.add(new CityItem(getString(R.string.attraction_name_5), getString(R.string.attraction_address_5), R.drawable.bismarckturm));
        attractions.add(new CityItem(getString(R.string.attraction_name_6), getString(R.string.attraction_address_6), R.drawable.station));
        attractions.add(new CityItem(getString(R.string.attraction_name_7), getString(R.string.attraction_address_7), R.drawable.zoo));
        attractions.add(new CityItem(getString(R.string.attraction_name_8), getString(R.string.attraction_address_8), R.drawable.hahnen));

        CityItemAdapter adapter = new CityItemAdapter(getActivity(), attractions, R.color.clear_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
