package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        //Create an array of words.
//        String [] words = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";
//
//        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
//        Log.v("NumbersActivity", "Word at index 1: " + words[1]);
//        Log.v("NumbersActivity", "Word at index 2: " + words[2]);
//        Log.v("NumbersActivity", "Word at index 3: " + words[3]);
//        Log.v("NumbersActivity", "Word at index 4: " + words[4]);
//        Log.v("NumbersActivity", "Word at index 5: " + words[5]);
//        Log.v("NumbersActivity", "Word at index 6: " + words[6]);
//        Log.v("NumbersActivity", "Word at index 7: " + words[7]);
//        Log.v("NumbersActivity", "Word at index 8: " + words[8]);
//        Log.v("NumbersActivity", "Word at index 9: " + words[9]);


        //Create an array list of words.
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("night");
        words.add("ten");

//        // Verify the contents of the ArrayList by printing out each ArrayList element to the logs
//        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
//        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
//        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
//        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
//        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
//        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
//        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
//        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
//        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
//        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));

//        // Manually add textviews.
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(0));
//        rootView.addView(wordView);

//        //Find the root view of the whole layout
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        /*
//        Setup counter variable
//        Create a variable to keep track of the current index position
//         */
//        int index = 0;
//
//        while (index < words.size()) {
//
//           /*
//           Instructions
//           Create a new TextView that displays the word
//           add the view as a child to the rootView
//            */
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//            //Update counter variable
//            index++; //index = index + 1
//
//        }

//        for (int index = 0; index < words.size(); index++) {
//
//            //Create a new TextView
//            TextView wordView = new TextView(this);
//
//            //Set the text to be word at the current index
//            wordView.setText(words.get(index));
//
//            //Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//        }

        /*
        Create an ArrayAdapter, whose data source is a list of String.
        The adapter knows how to create layouts for each item in the list, using the simple_list_item_1.xml layout resource defined in the Android framwork.
        This list item layout contains a single TextView, which the adapter will set to display a single word.
         */
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);

        /*
        Find the ListView object in the view hierarchy of the Activity.
        There should be a ListView with the view ID called list, which is declared in activity_numbers xml layout file.
         */
        ListView listView = (ListView) findViewById(R.id.list);

        /*
        Make the ListView use the ArrayAdapter we created above, so that the List View will display list items for each word in the list of words.
        Do this by calling the setAdapter method on the ListView object and pass in 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
         */
        listView.setAdapter(itemsAdapter);

    }
}
