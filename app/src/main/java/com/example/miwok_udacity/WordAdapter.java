package com.example.miwok_udacity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private TextView defaultLang, miwokLang;
    private ImageView imageView;
    private LinearLayout layout;
    private int BackgroundColor;

    public WordAdapter(@NonNull Context context, int res, @Nullable ArrayList<Word> objects) {
        super(context, 0, objects);
        BackgroundColor = res;
    }

//    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects) {
//        super(context,0, objects);
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view==null)
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        initViews(view);
        Word wordObject = getItem(position);
        miwokLang.setText(wordObject.getMiwok());
        defaultLang.setText(wordObject.getEnglish());
        if(wordObject.getImageId()!=0) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(wordObject.getImageId());
        }
        return view;
    }

    public void initViews(View view){
        miwokLang = view.findViewById(R.id.numMiwok);
        defaultLang = view.findViewById(R.id.numEng);
        imageView = view.findViewById(R.id.imageView);
        imageView.setVisibility(View.GONE);
        layout = view.findViewById(R.id.linearLayout);
        int color = ContextCompat.getColor(getContext(), BackgroundColor);
        layout.setBackgroundColor(color);
    }
}
