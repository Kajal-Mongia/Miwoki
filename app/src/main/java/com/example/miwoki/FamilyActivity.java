package com.example.miwoki;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        ArrayList<Word> family=new ArrayList<>(  );
        family.add( new Word( "father", "әpә",R.drawable.family_father ) );
        family.add( new Word(  "mother", "әṭa",R.drawable.family_mother) );
        family.add( new Word( "son" ,"angsi",R.drawable.family_son ) );
        family.add( new Word( "daughter", "tune",R.drawable.family_daughter ) );
        family.add( new Word( "older brother", "taachi",R.drawable.family_older_brother ) );
        family.add( new Word( "younger brother", "chalitti",R.drawable.family_younger_brother ) );
        family.add( new Word( "older sister", "teṭe",R.drawable.family_older_sister ) );
        family.add( new Word( "younger sister", "kollit",R.drawable.family_younger_sister ) );
        family.add( new Word( "grandmother" ,"ama",R.drawable.family_grandmother ) );
        family.add( new Word( "grandfather","paapa",R.drawable.family_grandfather ) );

//        initialize an ArrayAdapter object
        WordAdapter adapter=new WordAdapter( this,family );
        //Find the ListView
        ListView listView=findViewById(R.id.list);
        //attach the adapter to the ListView object
        listView.setAdapter( adapter );

    }
}
