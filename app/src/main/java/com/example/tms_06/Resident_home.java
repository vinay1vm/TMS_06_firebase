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




    public void onBackPressed() {
        //  super.onBackPressed();
        moveTaskToBack(true);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resident_home);
        getSupportActionBar().hide();







        //DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");



        TextView username=findViewById(R.id.usrname);
        Button sr=findViewById(R.id.srbtn);
        Button visitor=findViewById(R.id.visitorbtn);




        username.setText(GlobalVar.name);



        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),AddServiceRequest.class);
                startActivity(intent);
            }
        });


        visitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Visitor.class);
                startActivity(intent);
            }
        });

    }
}