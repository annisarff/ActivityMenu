package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    TextView txEmail, txPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil2);

        txEmail=findViewById(R.id.tvEmail);
        txPass=findViewById(R.id.tvPassword);

        Bundle bundle=getIntent().getExtras();

        String email=bundle.getString("a");
        String pass=bundle.getString("b");

        txEmail.setText(email);
        txPass.setText(pass);
    }
}