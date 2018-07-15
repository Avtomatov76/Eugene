package com.example.android.eugene;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container,false);

        // Create a list of items(restaurants).
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.waffle, R.string.waffle_address, R.string.waffle_description,
                R.drawable.off_the_waffle));
        items.add(new Item(R.string.dickie_jo, R.string.dickie_jo_address,
                R.string.dickie_jo_description, R.drawable.dickie_joes));
        items.add(new Item(R.string.sabai, R.string.sabai_address,
                R.string.sabai_description, R.drawable.sabai_cafe));
        items.add(new Item(R.string.tacovore, R.string.tacovore_address,
                R.string.tacovore_description, R.drawable.tacovore));
        items.add(new Item(R.string.makoto, R.string.makoto_address,
                R.string.marche_description, R.drawable.makoto));
        items.add(new Item(R.string.brails, R.string.brails_address,
                R.string.brails_description, R.drawable.brails));
        items.add(new Item(R.string.cornucopia, R.string.cornucopia_address,
                R.string.cornucopia_description, R.drawable.cornucopia));
        items.add(new Item(R.string.marche, R.string.marche_address,
                R.string.marche_description, R.drawable.marche));
        items.add(new Item(R.string.excelsior, R.string.excelsior_address,
                R.string.excelsior_description, R.drawable.excelsior));
        items.add(new Item(R.string.kungfu, R.string.kungfu_address,
                R.string.kungfu_description, R.drawable.kung_fu));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.bitesFragment);

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
