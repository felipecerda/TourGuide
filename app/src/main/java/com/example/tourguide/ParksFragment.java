package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<CityItem> attractions = new ArrayList<CityItem>();

        attractions.add(new CityItem(getString(R.string.attraction_name_1), getString(R.string.attraction_address_1)));
        attractions.add(new CityItem(getString(R.string.attraction_name_2), getString(R.string.attraction_address_2)));

        CityItemAdapter adapter = new CityItemAdapter(getActivity(), attractions, R.color.clear_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
