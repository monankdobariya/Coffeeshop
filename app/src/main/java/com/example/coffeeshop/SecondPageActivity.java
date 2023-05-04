package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondPageActivity extends AppCompatActivity {
CardView cardlogin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        initview();
    }

    private void initview() {
        cardlogin2=findViewById(R.id.cardlogin2);

        cardlogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(SecondPageActivity.this,HomePageActivity.class);
                startActivity(d);
            }
        });
    }
}