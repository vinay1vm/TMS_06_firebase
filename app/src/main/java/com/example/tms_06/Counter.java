package com.example.tms_06;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class Counter {
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://tms006-7c621-default-rtdb.firebaseio.com/");
    DatabaseReference reference=FirebaseDatabase.getInstance().getReference("Counter");
    static int id = 13;




     static void Count() {


        id = id + 1;

    }

    //String test=Integer.toString(id);




}
