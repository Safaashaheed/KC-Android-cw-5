package com.example.myapplicationsafaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class safaa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safaa);
        TextView nameTextView = findViewById(R.id.name);
        ImageView imege = findViewById(R.id.imageView);

        

        TextView ageTextView = findViewById(R.id.age);
           Bundle bundle = getIntent().getExtras();


           // name
           String safaa2 = bundle.getString("safaa2");
           nameTextView.setText(safaa2);



        //age
               int age = bundle.getInt("safaa3");
               ageTextView.setText(String.valueOf(safaa2));


//image











    }
}