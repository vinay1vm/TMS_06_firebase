package com.example.tms_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddServiceRequest extends AppCompatActivity {



    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(AddServiceRequest.this, Resident_home.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_service_request);
        getSupportActionBar().hide();

        Button SR=findViewById(R.id.addSR);



        SR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddServiceRequest.this, ServiceRequest.class));
            }
        });

    }
}