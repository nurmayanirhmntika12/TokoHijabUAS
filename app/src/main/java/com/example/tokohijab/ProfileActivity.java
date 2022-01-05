package com.example.tokohijab;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        btnBack = findViewById(R.id.btn_back_to_home);
        btnBack.setOnClickListener(view -> {
            onBackPressed();
        });
    }
}
