package com.example.tms_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Visitor extends AppCompatActivity {


    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Visitor.this, Resident_home.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);
        getSupportActionBar().hide();


        Button AddV=findViewById(R.id.addvisitor);



        AddV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),AddVisitor.class);
                startActivity(intent);
            }
        });


    }
}