package com.example.toggle_switch_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ToggleButton tg1 = findViewById(R.id.toggleButton);
        Switch sw = findViewById(R.id.switch1);
        Button btn = findViewById(R.id.button);
        LinearLayout screen = findViewById(R.id.screen1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sw.isChecked() == false && tg1.isChecked() == false)
                {
                    screen.setBackgroundResource(R.drawable.dababy2);
                }
                if (sw.isChecked() == true && tg1.isChecked() == false)
                {
                    screen.setBackgroundResource(R.drawable.dabloke);
                }
                if (sw.isChecked() == false && tg1.isChecked() == true)
                {
                    screen.setBackgroundResource(R.drawable.elbebe);
                }
                if (sw.isChecked() == true && tg1.isChecked() == true)
                {
                    screen.setBackgroundResource(R.drawable.davision);
                }
            }
        });
    }
}