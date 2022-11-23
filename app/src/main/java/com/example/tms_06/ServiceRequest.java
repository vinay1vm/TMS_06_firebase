package com.example.tms_06;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class ServiceRequest extends AppCompatActivity {

    DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReferenceFromUrl("https://tms-06-default-rtdb.firebaseio.com/");
    StorageReference storageReference= FirebaseStorage.getInstance().getReference();

    private static final int Launch_code = 2;
    Uri uri;


    int id=0;
    TextView done=findViewById(R.id.ok);
    ImageView image=findViewById(R.id.image);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_request);
        getSupportActionBar().hide();


//spinner decleration
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


//ImagePicker
//        attachment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//               // int Launch_code=2;
//                Intent galleryintent = new Intent();
//                galleryintent.setAction(Intent.ACTION_GET_CONTENT);
//                galleryintent.setType("image/*");
//                startActivityForResult(galleryintent,Launch_code);
//            }
//        });





//TODatabase
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            String Spinval=s.getSelectedItem().toString();
            String descc=desc.getText().toString();
            // String aa=name.getChars().toString();



            Intent intent=getIntent();
            final String name=intent.getStringExtra("Rname");
            final String email=intent.getStringExtra("Remail");
            final String doorno=intent.getStringExtra("Rdoorno");
            final String phno=intent.getStringExtra("Rphno");




            id++;
            String ID = Integer.toString(id);

               // DatabaseReference reference=FirebaseDatabase.getInstance().getReference().child(Spinval);

                if (!Spinval.matches(" ") || !descc.matches("" ) ) {

                    Toast.makeText(ServiceRequest.this, "Fields cant be empty", Toast.LENGTH_SHORT).show();

                }
                else{
                    if(Spinval == "Plumber") {

                        databaseReference.child("Requests").child(Spinval).child(ID).child("full_name").setValue(name);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("door_no").setValue(doorno);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("email").setValue(email);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("ph_no").setValue(phno);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("description").setValue(descc);

                        //UploadImage(uri);

                        Toast.makeText(ServiceRequest.this, "Request Raised", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(ServiceRequest.this,Resident_home.class));


                    }
                    if(Spinval == "Laundry"){


                        databaseReference.child("Requests").child(Spinval).child(ID).child("full_name").setValue(name);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("door_no").setValue(doorno);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("email").setValue(email);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("ph_no").setValue(phno);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("description").setValue(descc);

                       // UploadImage(uri);
                        Toast.makeText(ServiceRequest.this, "Request Raised", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(ServiceRequest.this,Resident_home.class));
                    }
                    if(Spinval == "Electrican"){


                        databaseReference.child("Requests").child(Spinval).child(ID).child("full_name").setValue(name);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("door_no").setValue(doorno);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("email").setValue(email);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("ph_no").setValue(phno);
                        databaseReference.child("Requests").child(Spinval).child(ID).child("description").setValue(descc);

                       // UploadImage(uri);
                        Toast.makeText(ServiceRequest.this, "Request Raised", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(ServiceRequest.this,Resident_home.class));
                    }


                }


            }


        });

    }
}
