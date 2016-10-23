package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an array list of words.
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus",R.mipmap.ic_launcher));
        words.add(new Word("What is your name?", "tinnә oyaase'nә",R.mipmap.ic_launcher));
        words.add(new Word("My name is...", "oyaaset...",R.mipmap.ic_launcher));
        words.add(new Word("How are you feeling?", "michәksәs?",R.mipmap.ic_launcher));
        words.add(new Word("I’m feeling good.", "kuchi achit",R.mipmap.ic_launcher));
        words.add(new Word("Are you coming?", "әәnәs'aa?",R.mipmap.ic_launcher));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.mipmap.ic_launcher));
        words.add(new Word("I’m coming.", "әәnәm",R.mipmap.ic_launcher));
        words.add(new Word("Let’s go.", "yoowutis",R.mipmap.ic_launcher));
        words.add(new Word("Come here.", "әnni'nem",R.mipmap.ic_launcher));

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
