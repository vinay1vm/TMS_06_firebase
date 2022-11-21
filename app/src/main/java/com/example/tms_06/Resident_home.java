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




        TextView username=findViewById(R.id.usrname);

        Button sr=findViewById(R.id.srbtn);





        Intent intent=getIntent();
        String uname=intent.getStringExtra("name");
          String email=intent.getStringExtra("email");
          String doorno=intent.getStringExtra("doorno");
          String phno=intent.getStringExtra("phno");

        username.setText(uname);







        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ServiceRequest.class);
                intent.putExtra("Rname",uname);
                intent.putExtra("Remail",email);
                intent.putExtra("Rdoorno",doorno);
                intent.putExtra("Rphno",phno);


                startActivity(intent);
            }
        });


    }






    }
