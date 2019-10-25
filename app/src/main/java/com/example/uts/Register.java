package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void masuk(View view) {
        Intent intent = new Intent( Register.this, Login.class );
        startActivity(intent);
    }
    public void DAFTAR (View view) {
        Intent intent = new Intent( Register.this, Dashboard.class);
        startActivity(intent);

    }
}
