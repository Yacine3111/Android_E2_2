package com.example.e2_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {
    String textEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        EditText editText = findViewById(R.id.nameEditText);
        Button bouton = findViewById(R.id.nameButton);

        bouton.setOnClickListener(view->{
            textEditText= editText.getText().toString();

            if(!textEditText.trim().isEmpty()){
                    Intent activity = new Intent(NameActivity.this, HelloActivity.class);
                    activity.putExtra("name",textEditText);
                    startActivity(activity);
            }else{
                Toast.makeText(this, "entrez un nom", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
