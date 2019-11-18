package com.example.miwoki;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        ArrayList<Word> colors=new ArrayList<Word>(  );
        colors.add( new Word( "Red","weṭeṭṭi",R.drawable.color_red ) );
        colors.add( new Word( "Green", "chokokki",R.drawable.color_green) );
        colors.add( new Word( "brown","ṭakaakki",R.drawable.color_brown) );
        colors.add( new Word( "gray","ṭopoppi",R.drawable.color_gray) );
        colors.add( new Word( "black", "kululli",R.drawable.color_black ) );
        colors.add( new Word( "white" ,"kelelli",R.drawable.color_white ) );
        colors.add( new Word( "dusty yellow" ,"ṭopiisә",R.drawable.color_dusty_yellow ) );
        colors.add( new Word( "mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow ) );

        WordAdapter adapter=new WordAdapter( this,colors );
        ListView listView=findViewById( R.id.list);
        listView.setAdapter( adapter );

    }
}
