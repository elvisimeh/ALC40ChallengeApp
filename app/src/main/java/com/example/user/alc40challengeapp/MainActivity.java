package com.example.user.alc40challengeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//private Button button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickprof(View view) {
        Intent intent = new Intent(this, about.class);
        EditText editText = (EditText) findViewById(R.id.button3);

        startActivity(intent);
    }

    public void onClickprof2(View view) {
        Intent intent = new Intent(this, profile2.class);
        EditText editText = (EditText) findViewById(R.id.button4);

        startActivity(intent);
    }
}
