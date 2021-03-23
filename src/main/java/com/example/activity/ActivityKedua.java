package com.example.activity;

import android.os.Bundle;
import android.widget.TextView;
import  androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity{
    //Mendeklarasikan variabel dengan tipe data TextView
    TextView tUser, tPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //menghubungkan variabel tUser dengan componen TextView pada layout
        tUser=findViewById(R.id.tvEmail);
        tPass=findViewById(R.id.tvPassword);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil pesan yang dikirimkan
        //method intent
        Bundle bundle=getIntent().getExtras();
        //membuat variabel string yang digunakan untuk menyimpan data yang dikirimkan dari activity
        //sebelumnya dengan kunci "a"
        String email = bundle.getString("a");
        //membuat variabel string yang digunakan untuk menyimpan data yang dikirimkan dari activity
        //sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam tUser
        tUser.setText(email);
        //menampilkan value dari variabel email kedalam tUser
        tPass.setText(pass);

    }
}
