package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jane on 16-10-18.
 */

/*
WordAdapter is an ArrayAdapter that can provide the layout for each list based on a data source, which is a list of Word objects.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    //Resource ID for the background color for this list of words
    private int mColorResourceId;

    /*
    This is our own custom constructor (it doesn't mirror a superclass constructor).
    The context is used to inflate the layout file, and the list is the data we want to populate into the lists.
    @param context The current context. Used to inflate the layout file.
    @param Word A list of Word objects to display in a list.
    @param colorResourceId is the resource ID for the background color for this list of words.
     */
    public WordAdapter(Activity context, ArrayList<Word> word, int colorResourceId) {

        /*
        Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        The second argument is used when the ArrayAdapter is populating a single TextView.
        Because this is a custom adapter for two TextViews, the adapter is not going to use this second argument, so it can be any value.
        Here, we used 0.
         */
        super(context, 0, word);
        mColorResourceId = colorResourceId;
    }

    /*
    Provides a view for an AdapterView (ListView, Gridview, etc.)
    @param position The position in the list of data that should be displayed in the list item view.
    @param converView The recycled view to populate.
    @param parent the parent ViewGroup that is used for inflation.
    @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // Get the MiwokTranslation from the current Word object and
        // set this text on the miwok TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the DefaultTranslation from the current Word object and
        // set this text on the default TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        if (currentWord.hasImage()) {
            // Get the image resource ID from the current Word object and
            // set the image to iconView
            iconView.setImageResource(currentWord.getImageResourceId());
            //Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the iconView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}