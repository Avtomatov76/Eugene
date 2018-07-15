package com.example.android.eugene;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of events.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container,false);

        // Create a list of items(events).
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.sat_market, R.string.sat_market_address,
                R.string.sat_market_description, R.drawable.saturday_market));
        items.add(new Item(R.string.scandi_fest, R.string.scandi_fest_address,
                R.string.scandi_fest_description, R.drawable.scandi_fest));
        items.add(new Item(R.string.whiteaker, R.string.whiteaker_address,
                R.string.whiteaker_description, R.drawable.whiteaker));
        items.add(new Item(R.string.food_truck, R.string.food_truck_address,
                R.string.food_truck_description, R.drawable.food_truck));
        items.add(new Item(R.string.rodeo, R.string.rodeo_address,
                R.string.rodeo_description, R.drawable.rodeo));
        items.add(new Item(R.string.country_fair, R.string.country_fair_address,
                R.string.country_fair_description, R.drawable.country_fair));
        items.add(new Item(R.string.bach_fest, R.string.bach_fest_address,
                R.string.bach_fest_description, R.drawable.bach_fest));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.eventsFragment);

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
