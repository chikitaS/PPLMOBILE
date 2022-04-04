package com.example.myeasiness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView detailNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailNotes = findViewById(R.id.detailNote);
        Intent intent = getIntent();
        String Notes = intent.getStringExtra("notes");
        detailNotes.setText(Notes);
    }
}