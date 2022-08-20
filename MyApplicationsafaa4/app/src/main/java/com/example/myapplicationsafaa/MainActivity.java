package com.example.myapplicationsafaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name1 = findViewById(R.id.name);
        EditText age1 = findViewById(R.id.age);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                if (name1.length() == 0) {
                    name1.setError("safaa shahheed");
                } else {
                    if (age1.length() == 0) {
                        age1.setError("16");
                    } else {

                        String name = name1.getText().toString();
                        int age = Integer.parseInt(age1.getText().toString());
                        Intent intent = new Intent(MainActivity.this, safaa.class);
                        intent.putExtra("safaa2", name);
                        intent.putExtra("safaa3", age);


                        startActivity(intent);
                    }
                }
            }
        });
    }
}













