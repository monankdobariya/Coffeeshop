package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomePage2Activity extends AppCompatActivity {
    CardView cardcontinue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page2);
        initview();
    }

    private void initview() {
        cardcontinue2=findViewById(R.id.cardcontinue2);

        cardcontinue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(WelcomePage2Activity.this,LoginPageActivity.class);
                startActivity(b);
            }
        });
    }
}