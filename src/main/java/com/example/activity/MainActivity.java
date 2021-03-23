package com.example.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edUser, edPass;
    Button btnOK;
    String usr, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK=findViewById(R.id.button);
        edUser=findViewById(R.id.editUser);
        edPass=findViewById(R.id.editPassword);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usr = edUser.getText().toString();
                password = edPass.getText().toString();

                if(edUser.getText().toString().equals("")&&edPass.getText().toString().equals("")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN GAGAL", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    if(edUser.getText().toString().equals("admin@mail.com")&&edPass.getText().toString().equals("123")) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "LOGIN SUKSES || email : " + usr + " password : " + password + "", Toast.LENGTH_LONG);
                        t.show();
                        //membuat objek bundle
                        Bundle b =new Bundle();
                        //memasukkan value dari  variabel nama dengan kunci "a"
                        //dan dimasukkan ke dalam bundle
                        b.putString("a", usr.trim());
                        //memasukkan value dari  variabel nama dengan kunci "b"
                        //dan dimasukkan ke dalam bundle
                        b.putString("b", password.trim());

                        //membuat objek intent berpindah activity dari mainactivity ke ActivityHasil
                        Intent i = new Intent(getApplicationContext(),ActivityHasil.class);
                        //memasukkan bundle ke dalam intent untuk dikirimkan ke ActivityHasil
                        i.putExtras(b);
                        //berpindah ke ActivityHasil
                        startActivity(i);
                    }
                    else{
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);
                        t.show();
                    }
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.mnDaftar){
            Intent i = new Intent(getApplicationContext(), FormPendaftaran.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}