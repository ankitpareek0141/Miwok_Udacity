package com.example.miwok_udacity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtNumbers, txtFamily, txtColors, txtPhrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumbers = findViewById(R.id.txtNumbers);
        txtFamily = findViewById(R.id.txtFamily);
        txtColors = findViewById(R.id.txtColors);
        txtPhrases = findViewById(R.id.txtPhrases);

    }

    public void onClick(View view) {
        Intent intent = null;
        if(view.getId()==R.id.txtNumbers)
            intent = new Intent(this, NumbersActivity.class);
        else if(view.getId()==R.id.txtFamily)
            intent = new Intent(this, FamilyActivty.class);
        else if(view.getId()==R.id.txtColors)
            intent = new Intent(this, ColorsActivity.class);
        else if(view.getId()==R.id.txtPhrases)
            intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }
}