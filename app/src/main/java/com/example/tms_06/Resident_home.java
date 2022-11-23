package com.example.tms_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Resident_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resident_home);
        getSupportActionBar().hide();




        Button sr=findViewById(R.id.srbtn);


        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");



        TextView username=findViewById(R.id.usrname);
        Intent intent=getIntent();
        String uname=intent.getStringExtra("name");

        username.setText(uname);



        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Resident_home.this,ServiceRequest.class));
            }
        });


    }
}