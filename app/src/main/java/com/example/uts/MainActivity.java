package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    new Handler().postDelayed(new Runnable() {@Override public void run (){
        Intent intent=onNewIntent(MainActivity.this,activity_register.xml.class);
        startActivity(intent);finish();}},waktu_loading(3000);
    })

}
