package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    //Handles playback of all the sound files
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array list of words.
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        /*
        Create an WordAdapter, whose date source is a list of Words.
        The adaper knows how to create list items for each item in the list.
         */
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        /*
        Find the ListView object in the view hierarchy of the Activity.
        There should be a ListView with the view ID called list, which is declared in word_list xml layout file.
         */
        ListView listView = (ListView) findViewById(R.id.list);

        /*
        Make the ListView use the WordAdapter we created above, so that the ListView will display list items for each word in the list.
         */
        listView.setAdapter(adapter);

        //Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Get the Word Object at the given position the user clicked on
                Word word = words.get(position);

                //Create and setup the MediaPlayer for the audio resource associated with the current word
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getSoundResourceId());

                //Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
