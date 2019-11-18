package com.example.miwoki;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list );
        ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word( "one","lutti",R.drawable.number_one));
        words.add(new Word( "two","otiiko",R.drawable.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three));
        words.add(new Word( "four","oyyisa",R.drawable.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight));
        words.add(new Word( "nine","wo’e",R.drawable.number_nine));
        words.add(new Word( "ten","na’aacha",R.drawable.number_ten));

//        // Method 1.
//        //Method which allocates memory to all views to be added in the list (not memory efficient)
//        LinearLayout rootView=findViewById( R.id.rootView );
//        for(int index=0;index<words.size();index++){
//            //Create a new TextView
//            TextView wordView=new TextView( this );
//            //set the textView to a given text
//            wordView.setText( words.get( index) );
//            //add textView as another child of the existing linearLayout
//            rootView.addView( wordView );
//        }


//        //Method 2.
        //ArrayAdapter with ListView (memory efficient)

        //initialize an ArrayAdapter object
        WordAdapter adapter=new WordAdapter( this,words );
        //Find the ListView
        ListView listView=findViewById(R.id.list);
        //attach the adapter to the ListView object
        listView.setAdapter( adapter );

//        //ArrayAdapter with GridView
//        GridView gridView=findViewById( R.id.grid );
//        gridView.setAdapter( adapter );


    }
}
