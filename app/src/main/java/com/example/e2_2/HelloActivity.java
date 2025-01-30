package com.example.e2_2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Bundle extras = getIntent().getExtras();
        String name= extras.getString("name");

        TextView textView = findViewById(R.id.nameTextView);
        textView.setText("Bonjour "+name);
    }
}
