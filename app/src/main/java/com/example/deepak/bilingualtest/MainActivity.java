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
        eng.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                LocaleHelper.setLocale(this, "en");
                updateViews();

            }
    private void updateViews() {
        // if you want you just call activity to restart itself to redraw all the widgets with the correct locale
        // however, it will cause a bad look and feel for your users
        //
        // this.recreate();
        recreate();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
