package com.example.dynamicviewadder;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = findViewById(R.id.main);

        // Add one button
        Button btn = new Button(this);
        btn.setText("I'm a new button!");
        mainLayout.addView(btn);

        // Add two buttons
        Button btn2 = new Button(this);
        btn2.setText("Second Button");
        mainLayout.addView(btn2);

        // Create a row with two buttons
        LinearLayout rowLayout = new LinearLayout(this);
        rowLayout.setOrientation(LinearLayout.HORIZONTAL);

        Button btnA = new Button(this);
        btnA.setText("Row Button 1");
        rowLayout.addView(btnA);

        Button btnB = new Button(this);
        btnB.setText("Row Button 2");
        rowLayout.addView(btnB);

        mainLayout.addView(rowLayout);
    }
}