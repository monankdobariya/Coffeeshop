package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePageActivity extends AppCompatActivity {
    ImageView imgprofile, imgcart, imglike;
    CardView cardphoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        initview();
    }

    private void initview() {
        imgprofile = findViewById(R.id.imgprofile);
        imgcart = findViewById(R.id.imgcart);
        cardphoto = findViewById(R.id.cardphoto);
        imglike = findViewById(R.id.imglike);

        imgprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(HomePageActivity.this, AccountPageActivity.class);
                startActivity(e);
            }
        });
        imgcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(HomePageActivity.this, CartPageActivity.class);
                startActivity(f);

            }
        });
        cardphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(HomePageActivity.this, FilterPageActivity.class);
                startActivity(g);
            }
        });

        imglike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(HomePageActivity.this, FavoritePageActivity.class);
                startActivity(j);
            }
        });
    }
}