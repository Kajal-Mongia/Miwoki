package com.example.miwoki;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);
        ArrayList<Word> phrases= new ArrayList<>(  );
        phrases.add( new Word( "Where are you going?","minto wuksus" ) );
        phrases.add( new Word( "What is your name?" ,"tinnә oyaase'nә" ) );
        phrases.add( new Word( "My name is...", "oyaaset.." ) );
        phrases.add( new Word( "How are you feeling?" ,"michәksәs?") );
        phrases.add( new Word( "I’m feeling good.", "kuchi achit" ) );
        phrases.add( new Word( "Are you coming?", "әәnәs'aa?" ) );
        phrases.add( new Word("Yes, I’m coming.", "hәә’ әәnәm") );
        phrases.add( new Word( "I’m coming.","әәnәm" ) );
        phrases.add( new Word( "Let’s go.", "yoowutis" ) );
        phrases.add( new Word( "Come here.", "әnni'nem" ) );

        //initialize an ArrayAdapter object
        WordAdapter adapter=new WordAdapter( this,phrases );
        //Find the ListView
        ListView listView=findViewById(R.id.list);
        //attach the adapter to the ListView object
        listView.setAdapter( adapter );





    }
}
