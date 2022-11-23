package com.example.tms_06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ServiceRequest extends AppCompatActivity {

    DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReferenceFromUrl("https://tms-06-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_request);


        String[] arraySpinner = new String[] {" ", "Plumber", "Laundry", "Electrican"};
        Spinner s = (Spinner) findViewById(R.id.serviceList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);






        EditText desc=findViewById(R.id.editText);
        TextView attachment=findViewById(R.id.attach);
        Button submit=findViewById(R.id.SrSubmit);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Spinval=s.getSelectedItem().toString();
                String descc=desc.toString();

                if(Spinval==" " || descc.isEmpty())  {
                    Toast.makeText(ServiceRequest.this, "Fields cant be empty", Toast.LENGTH_SHORT).show();

                }
                else{
                    if(Spinval == "Plumber") {






                    }
                }


            }
        });

    }
}