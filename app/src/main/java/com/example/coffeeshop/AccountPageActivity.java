package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AccountPageActivity extends AppCompatActivity {
CardView cardhistory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page);
        initview();
    }

    private void initview() {
        cardhistory=findViewById(R.id.cardhistory);

        cardhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(AccountPageActivity.this,OderHistoryActivity.class);
                startActivity(a);
            }
        });
    }
}