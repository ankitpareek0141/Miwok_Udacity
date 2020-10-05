package com.example.miwok_udacity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_layout);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here", "әnni'nem"));
        WordAdapter wordAdapter = new WordAdapter(this, R.color.PhrasesColor, words);
        @SuppressLint("WrongViewCast") ListView listView = findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_where_are_you_going);
                    mediaPlayer.start();
                }
                else if(position==1){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_what_is_your_name);
                    mediaPlayer.start();
                }
                else if(position==2){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_my_name_is);
                    mediaPlayer.start();
                }
                else if(position==3){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_how_are_you_feeling);
                    mediaPlayer.start();
                }
                else if(position==4){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_im_feeling_good);
                    mediaPlayer.start();
                }
                else if(position==5){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_are_you_coming);
                    mediaPlayer.start();
                }
                else if(position==6){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_yes_im_coming);
                    mediaPlayer.start();
                }
                else if(position==7){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_im_coming);
                    mediaPlayer.start();
                }
                else if(position==8){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_lets_go);
                    mediaPlayer.start();
                }
                else if(position==9){
                    mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_come_here);
                    mediaPlayer.start();
                }
            }
        });
    }
}