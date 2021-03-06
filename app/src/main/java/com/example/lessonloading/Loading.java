package com.example.lessonloading;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.net.Inet4Address;

public class Loading extends AppCompatActivity {
    //SwipeRefreshLayout refreshLayout;
    ProgressBar proBar;
    static int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final TextView nameText = (TextView) findViewById(R.id.nameId);
        Button button = (Button) findViewById(R.id.backid);
        proBar = (ProgressBar) findViewById(R.id.probar) ;

        nameText.setText(name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proBar.setVisibility(View.VISIBLE);
//                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        proBar.setVisibility(View.INVISIBLE);
//                    }
//                }, 400);
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

//        refreshLayout =findViewById(R.id.refresh);
//        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                i++;
//                nameText.setText(name + " " + i);
//                refreshLayout.setRefreshing(false);
//            }
//        });
    }
}