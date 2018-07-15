package com.example.android.eugene;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of sights.
 */
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container,false);

        // Create a list of items(sights).
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.hendricks, R.string.hendricks_address,
                R.string.hendricks_description, R.drawable.hendricks));
        items.add(new Item(R.string.university, R.string.university_address,
                R.string.university_description, R.drawable.u_of_o));
        items.add(new Item(R.string.skinners, R.string.skinners_address,
                R.string.skinners_description, R.drawable.skinner_butte));
        items.add(new Item(R.string.market, R.string.market_address,
                R.string.market_description, R.drawable.fifth_street));
        items.add(new Item(R.string.autzen, R.string.autzen_address,
                R.string.autzen_description, R.drawable.autzen));
        items.add(new Item(R.string.hult, R.string.hult_address,
                R.string.hult_description, R.drawable.hult_center));
        items.add(new Item(R.string.garden, R.string.garden_address,
                R.string.garden_description, R.drawable.owen_rose));
        items.add(new Item(R.string.alton, R.string.alton_address,
                R.string.alton_description, R.drawable.alton_baker));
        items.add(new Item(R.string.mansion, R.string.mansion_address, R.string.mansion_description,
                R.drawable.shelton_house));
        items.add(new Item(R.string.museum, R.string.museum_address,
                R.string.museum_description, R.drawable.air_museum));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.sightsFragment);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
