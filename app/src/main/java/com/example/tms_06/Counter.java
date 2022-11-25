package com.example.tms_06;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Counter extends ServiceRequest{
    //DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://tms-06-default-rtdb.firebaseio.com/");
     static int id = 0;

    static void Count() {
        id = id + 1;

      //

    }

    String test=Integer.toString(id);




}
