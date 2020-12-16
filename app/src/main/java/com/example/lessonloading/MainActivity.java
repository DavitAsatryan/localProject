package com.example.lessonloading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    TextView loag;
    ProgressBar proBar;
    EditText nameEdit;
    Button ok;
    int i = 0;

    Handler hd = new Handler();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        loag = (TextView) findViewById(R.id.textId);
        proBar = (ProgressBar) findViewById(R.id.proBar);
        nameEdit = (EditText) findViewById(R.id.name);
        ok = (Button) findViewById(R.id.button);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                loag.setText("Loading...");
//                intent = new Intent(getApplicationContext(),Loading.class);
//                String name = nameEdit.getText().toString();
//                intent.putExtra("name", name);
//                proBar.setVisibility(View.VISIBLE);
//                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        proBar.setVisibility(View.INVISIBLE);
//                    }
//                },400);

//                startActivity(intent);
        startActivity(new Intent(MainActivity.this, Loading.class));
            }
        });
    }
   /* public void clickOk(View view){

        intent = new Intent(getApplicationContext(),Loading.class);
        String name = nameEdit.getText().toString();
        intent.putExtra("name",name);

    }*/

}