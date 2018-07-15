package com.example.android.eugene;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of breweries.
 */
public class BeerFragment extends Fragment {

    public BeerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container,false);

        // Create a list of items(breweries).
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.ninkasi, R.string.ninkasi_address, R.string.ninkasi_description,
                R.drawable.ninkasi));
        items.add(new Item(R.string.hop_valley, R.string.hop_valley_address,
                R.string.hop_valley_description, R.drawable.hop_valley));
        items.add(new Item(R.string.sam_bonds, R.string.sam_bonds_address,
                R.string.sam_bonds_description, R.drawable.sam_bonds));
        items.add(new Item(R.string.tap_growler, R.string.tap_growler_address,
                R.string.tap_growler_description, R.drawable.tap_growler));
        items.add(new Item(R.string.elk_horn, R.string.elk_horn_address,
                R.string.elk_horn_description, R.drawable.elk_horn));
        items.add(new Item(R.string.coldfire, R.string.coldfire_address,
                R.string.coldfire_description, R.drawable.cold_fire));
        items.add(new Item(R.string.oakshire, R.string.oakshire_address,
                R.string.oakshire_description, R.drawable.oakshire));
        items.add(new Item(R.string.claim_52, R.string.claim_52_address,
                R.string.claim_52_description, R.drawable.claim_52));
        items.add(new Item(R.string.viking, R.string.viking_address, R.string.viking_description,
                R.drawable.viking));
        items.add(new Item(R.string.bier_stein, R.string.bier_stein_address,
                R.string.bier_stein_description, R.drawable.bier_stein));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.brewsFragment);

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
