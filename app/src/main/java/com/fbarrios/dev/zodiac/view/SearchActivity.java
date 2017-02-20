package com.fbarrios.dev.zodiac.view;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.fbarrios.dev.zodiac.R;
import com.fbarrios.dev.zodiac.model.ZodiacSign;

public class SearchActivity extends AppCompatActivity {

    private EditText brightestStarEt;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        brightestStarEt = (EditText) findViewById(R.id.brightestStarEt);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ZodiacSign zodiacSign = new ZodiacSign();
                String myStar = zodiacSign.getBrightestStar(brightestStarEt.getText().toString());

                Log.d("TAG", "onClick: " + myStar);

                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle(R.string.app_name)
                        .setIcon(ContextCompat.getDrawable(context, R.mipmap.ic_launcher))
                        .setMessage("Your brightest star is: " + myStar)
                        .show();

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
