package com.example.tms_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {

    DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReferenceFromUrl("https://tms-06-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        EditText name=findViewById(R.id.regname);
        EditText email=findViewById(R.id.regEmail);
        EditText doorno=findViewById(R.id.regdno);
        EditText phno=findViewById(R.id.regphNo);
        EditText pass=findViewById(R.id.regpass);
        Button submit=findViewById(R.id.regsubmitbtn);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String names= name.getText().toString();
                String emails= email.getText().toString();
                String doornos= doorno.getText().toString();
                String phnos= phno.getText().toString();
                String Rpasswords= pass.getText().toString();

                if(names.isEmpty() || emails.isEmpty() || doornos.isEmpty() || phnos.isEmpty() || Rpasswords.isEmpty()){
                    Toast.makeText(Signup.this, "Fields cant be empty", Toast.LENGTH_SHORT).show();

                }
                else{
                    databaseReference.child("users").child(doornos).child("full_name").setValue(names);
                    databaseReference.child("users").child(doornos).child("email").setValue(emails);
                    databaseReference.child("users").child(doornos).child("door_no").setValue(doornos);
                    databaseReference.child("users").child(doornos).child("ph_no").setValue(phnos);
                    databaseReference.child("users").child(doornos).child("password").setValue(Rpasswords);

                    Toast.makeText(Signup.this, "Register Success", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(Signup.this,MainActivity.class));
                }


            }
        });


    }
}