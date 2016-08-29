package com.example.deepak.bilingualtest;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


import com.example.deepak.bilingualtest.LocaleHelper;

public class MainActivity extends AppCompatActivity {



    private Button hin,eng;
    private TextView wel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eng = (Button)findViewById(R.id.eng_btn);
        hin = (Button)findViewById(R.id.hin_btn);



       // getActionBar().hide();


        }


}
