package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginPageActivity extends AppCompatActivity {
    CardView cardlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        initview();
    }

    private void initview() {
        cardlogin=findViewById(R.id.cardlogin);

        cardlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(LoginPageActivity.this,SecondPageActivity.class);
                startActivity(c);
            }
        });
    }
}