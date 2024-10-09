package com.example.praktikos1darbas;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void TextChange(View view) {
        TextView ManoTextView = findViewById(R.id.ManoTextView);
        ManoTextView.setText(R.string.mano_vardas_inga);
    }


    public void ChangeTextColor(View view) {
        TextView ManoTextView = findViewById(R.id.ManoTextView);
        // Change text color to green
        ManoTextView.setTextColor(Color.RED);
    }
    }

