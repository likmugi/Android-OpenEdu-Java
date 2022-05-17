package com.example.practiceipz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Food Choose");

        ImageButton btnNextLayout = findViewById(R.id.imgButtonNext);
        ImageButton btnBackLayout = findViewById(R.id.imgButtonBack);

        btnNextLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity("next");
            }
        });
        btnBackLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity("back");
            }
        });
    }

    private void OpenActivity(String answer) {
        if (answer == "back"){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }

    }
}