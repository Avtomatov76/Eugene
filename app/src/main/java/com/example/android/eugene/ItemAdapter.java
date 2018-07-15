package com.example.android.eugene;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

    /**
     * {@link ItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
     * based on a data source, which is a list of {@link Item} objects.
     */
public class ItemAdapter extends ArrayAdapter<Item> {

    /** Resource ID for the background color for this list of items */
    private int mColorResourceId;

    /**
     * Create a new {@link ItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items is the list of {@link Item}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public ItemAdapter(Context context, ArrayList<Item> items, int colorResourceId) {
        super(context, 0, items);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_item, parent, false);
        }

        // Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name.
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name);
        // Get the name of the item from the currentItem object and set this text on
        // the nameTextView TextView.
        nameTextView.setText(currentItem.getItemName());

        // Find the TextView in the list_item.xml layout with the ID address.
        TextView addressTextView = (TextView) convertView.findViewById(R.id.address);
        // Get the name of the item from the currentItem object and set this text on
        // the addressTextView TextView.
        addressTextView.setText(currentItem.getItemAddress());

        // Find the TextView in the list_item.xml layout with the ID description.
        TextView descriptionTextView = (TextView) convertView.findViewById(R.id.description);
        // Get the name of the item from the currentItem object and set this text on
        // the descriptionTextView TextView.
        descriptionTextView.setText(currentItem.getItemDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        // Check if an image is provided for this item or not
        if (currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getImageResource());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View infoContainer = convertView.findViewById(R.id.info_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        infoContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing an ImageView, and 3 TextViews) so that
        // it can be shown in the ListView.
        return convertView;
    }
}
