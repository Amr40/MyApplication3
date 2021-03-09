package com.example.gggg;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gggg.R;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new com.example.gggg.ParksFragment()).commit();
    }
}