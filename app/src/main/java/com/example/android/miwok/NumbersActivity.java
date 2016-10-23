package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array list of words.
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti", R.mipmap.ic_launcher));
        words.add(new Word("two", "otiiko",R.mipmap.ic_launcher));
        words.add(new Word("three", "tolookosu",R.mipmap.ic_launcher));
        words.add(new Word("four", "oyyisa",R.mipmap.ic_launcher));
        words.add(new Word("five", "massokka",R.mipmap.ic_launcher));
        words.add(new Word("six", "temmokka",R.mipmap.ic_launcher));
        words.add(new Word("seven", "kenekaku",R.mipmap.ic_launcher));
        words.add(new Word("eight", "kawinta",R.mipmap.ic_launcher));
        words.add(new Word("nine", "wo’e",R.mipmap.ic_launcher));
        words.add(new Word("ten", "na’aacha",R.mipmap.ic_launcher));

        /*
        Create an WordAdapter, whose date source is a list of Words.
        The adaper knows how to create list items for each item in the list.
         */
        WordAdapter adapter = new WordAdapter(this, words);

        /*
        Find the ListView object in the view hierarchy of the Activity.
        There should be a ListView with the view ID called list, which is declared in word_list xml layout file.
         */
        ListView listView = (ListView) findViewById(R.id.list);

        /*
        Make the ListView use the WordAdapter we created above, so that the ListView will display list items for each word in the list.
         */
        listView.setAdapter(adapter);

    }
}
