package com.example.practiceipz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Linear Layout");

        Button FirstButton = findViewById(R.id.button1);
        Button SecondButton = findViewById(R.id.button2);
        Button ThirdButton = findViewById(R.id.button3);

        FirstButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,R.string.answer1, Toast.LENGTH_LONG).show();
            }
        });
        SecondButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,R.string.answer2, Toast.LENGTH_LONG).show();
            }
        });
        ThirdButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,R.string.answer3, Toast.LENGTH_LONG).show();
            }
        });

        ImageButton btnNextLayout = findViewById(R.id.imageButton);
        btnNextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenNextActivity();
            }
        });
    }

    private void OpenNextActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}