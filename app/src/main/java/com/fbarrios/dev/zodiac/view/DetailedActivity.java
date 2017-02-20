package com.fbarrios.dev.zodiac.view;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.fbarrios.dev.zodiac.R;

import static com.fbarrios.dev.zodiac.R.id.toolbar_layout;

public class DetailedActivity extends AppCompatActivity {

    private ImageView zodiacIv;
    private TextView descriptionTv;
    private Toolbar toolbar;
    private CollapsingToolbarLayout toolbarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarLayout = (CollapsingToolbarLayout) findViewById(toolbar_layout);

        setSupportActionBar(toolbar);

        zodiacIv = (ImageView) findViewById(R.id.zodiacIv);
        descriptionTv = (TextView) findViewById(R.id.descriptionTv);

        String value = getIntent().getStringExtra("ZODIAC");

        if (value != null) {
            toolbarLayout.setTitle(value.toUpperCase());
            getInfo(value);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void getInfo(String zodiac) {

        switch (zodiac) {
            case "aries":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.aries));
                descriptionTv.setText(R.string.large_text_aries);
                break;
            case "aquarius":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.aquarius));
                descriptionTv.setText(R.string.large_text_aquarius);
                break;
            case "taurus":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.taurus));
                descriptionTv.setText(R.string.large_text_taurus);
                break;
            case "cancer":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.cancer));
                descriptionTv.setText(R.string.large_text_cancer);
                break;
            case "capricorn":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.capricorn));
                descriptionTv.setText(R.string.large_text_capricorn);
                break;
            case "gemini":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.gemini));
                descriptionTv.setText(R.string.large_text_gemini);
                break;
            case "leo":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.leo));
                descriptionTv.setText(R.string.large_text_leo);
                break;
            case "libra":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.libra));
                descriptionTv.setText(R.string.large_text_libra);
                break;
            case "pisces":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.pisces));
                descriptionTv.setText(R.string.large_text_pisces);
                break;
            case "sagittarius":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.sagittarius));
                descriptionTv.setText(R.string.large_text_sagittarius);
                break;
            case "scorpio":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.scorpio));
                descriptionTv.setText(R.string.large_text_scorpio);
                break;
            case "virgo":
                zodiacIv.setBackground(ContextCompat.getDrawable(this, R.drawable.virgo));
                descriptionTv.setText(R.string.large_text_virgo);
                break;
        }
    }
}
