package com.example.miwoki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super( context, 0, objects );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;

        //inflate a view if it doesn't already exist
        if(listItemView==null){
            listItemView=  LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        Word currentWord=getItem( position );

        TextView defaultTranslationTextView=listItemView.findViewById( R.id.englishWordTextView );
        defaultTranslationTextView.setText( currentWord.getDefaultTranslation() );

        TextView miwokiTranslationTextView=listItemView.findViewById( R.id.miwokiWordTextView);
        miwokiTranslationTextView.setText( currentWord.getMiwokiTranslation() );

        ImageView image=listItemView.findViewById( R.id.imageIcon );
        if(currentWord.hasImage()){
          image.setVisibility( View.VISIBLE );
          image.setImageResource( currentWord.getImageResID() );
        }else {
            image.setVisibility( View.GONE );
        }


        return listItemView;
    }
}
