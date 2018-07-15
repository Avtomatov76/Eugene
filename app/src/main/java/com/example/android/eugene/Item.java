package com.example.android.eugene;

/**
 * {@link Item} represents a category item that is displayed to the user.
 * It contains resource IDs for the name, address, description, and
 * an image file for that item.
 */
public class Item {

    /** String resource ID for the name of an item */
    private int mItemName;

    /** String resource ID for the address of an item */
    private int mItemAddress;

    /** String resource ID for the description of an item */
    private int mItemDescription;

    /** Image resource ID for the item */
    private int mImageResource;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param itemName is the string resource ID for the item's name that is displayed to the user
     *                 in a given category.
     * @param itemAddress is the string resource ID for the item's address that is displayed to the
     *                    user in a given category.
     * @param itemDescription is the string resource ID for the item's description that is displayed
     *                        to the user in a given category.
     * @param imageResource is the drawable resource ID associated with an item that's displayed to the user
     *                      in a given category.
     */
    public Item(int itemName, int itemAddress, int itemDescription, int imageResource) {
        mItemName = itemName;
        mItemAddress = itemAddress;
        mItemDescription = itemDescription;
        mImageResource = imageResource;
    }

    /**
     * Get the string resource ID for the name of the item.
     */
    public int getItemName() {
        return mItemName;
    }

    /**
     * Get the string resource ID for the address of the item.
     */
    public int getItemAddress() {
        return mItemAddress;
    }

    /**
     * Get the string resource ID for the description of the item.
     */
    public int getItemDescription() {
        return mItemDescription;
    }

    /**
     * Return the image resource ID of the item.
     */
    public int getImageResource() {
        return mImageResource;
    }

    /**
     * Returns whether or not there is an image for this item.
     */
    public boolean hasImage() {
        return mImageResource != NO_IMAGE_PROVIDED;
    }
}
