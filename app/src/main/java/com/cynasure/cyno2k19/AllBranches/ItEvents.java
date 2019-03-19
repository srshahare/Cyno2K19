package com.cynasure.cyno2k19.AllBranches;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cynasure.cyno2k19.AllEvents.ElectroPlazaEvent;
import com.cynasure.cyno2k19.AllEvents.LogiqueEvent;
import com.cynasure.cyno2k19.AllEvents.MindItEvent;
import com.cynasure.cyno2k19.AllEvents.TechnoGammaEvent;
import com.cynasure.cyno2k19.R;

public class ItEvents extends AppCompatActivity {

    private CardView first, second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_events);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        first = (CardView) findViewById(R.id.first_card);
        second = (CardView) findViewById(R.id.second_card);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("It Department");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstIntent = new Intent(ItEvents.this, MindItEvent.class);
                startActivity(firstIntent);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(ItEvents.this, TechnoGammaEvent.class);
                startActivity(secondIntent);
            }
        });

    }
}
