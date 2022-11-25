// Your package name can be different depending
// on your project name
package com.example.recyclerview;

public class ImageModel {
    // Variable to store data corresponding
    // to firstname keyword in database
    private String id;

    // Variable to store data corresponding
    // to lastname keyword in database
    private String name;

    // Variable to store data corresponding
    // to age keyword in database
    private String date;

    // Variable to store data corresponding
    // to age keyword in database
    private String time;

    // Mandatory empty constructor
    // for use of FirebaseUI
    public ImageModel() {
    }

    // Getter and setter method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



}
