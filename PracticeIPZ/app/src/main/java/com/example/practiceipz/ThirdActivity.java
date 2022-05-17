package com.example.practiceipz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ThirdActivity extends AppCompatActivity {

    int txtV = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        setTitle("UI");

        Button btnMoreInfo = findViewById(R.id.btnMoreInf);
        btnMoreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtNameUI = findViewById(R.id.txtNameUi);
                TextView txtUIMore = findViewById(R.id.txtUiMore);
                if(txtV == 0)
                {
                    txtNameUI.setVisibility(View.GONE);
                    txtUIMore.setVisibility(View.GONE);
                    txtV = 1;
                }
                else {
                    txtNameUI.setVisibility(View.VISIBLE);
                    txtUIMore.setVisibility(View.VISIBLE);
                    txtV = 0;
                }
            };
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