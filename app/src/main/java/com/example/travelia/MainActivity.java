package com.example.travelia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.idc1);
        card2 = (CardView) findViewById(R.id.idc2);
        card3 = (CardView) findViewById(R.id.idc3);
        card4 = (CardView) findViewById(R.id.idc4);
        card5 = (CardView) findViewById(R.id.idc5);
        card6 = (CardView) findViewById(R.id.idc6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.idc1:
                i = new Intent(this,one.class);
                startActivity(i);
                break;

            case R.id.idc2:
                i = new Intent(this,two.class);
                startActivity(i);
                break;

            case R.id.idc3:
                i = new Intent(this,three.class);
                startActivity(i);
                break;

            case R.id.idc4:
                i = new Intent(this,four.class);
                startActivity(i);
                break;

            case R.id.idc5:
                i = new Intent(this,five.class);
                startActivity(i);
                break;

            case R.id.idc6:
                i = new Intent(this,six.class);
                startActivity(i);
                break;

        }

    }
}