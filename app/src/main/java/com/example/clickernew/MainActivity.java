package com.example.clickernew;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private int deb = 1;
    private Button addButton;
    private Button subButton;
    private TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        countTextView = findViewById(R.id.countTextView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count + deb;
                TextView countTextView = findViewById(R.id.countTextView);
                countTextView.setText("Значение: " + count);
                if (count == 10) {
                    subButton.setVisibility(View.VISIBLE);
                }
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 0) {
                    count = count - 10;
                    deb++;
                    countTextView.setText("Значение: " + count);
                    if (count < 10) {
                        subButton.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });
    }
}