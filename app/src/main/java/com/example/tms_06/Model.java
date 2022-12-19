package com.example.tms_06;

public class Model {
    String cc, Resident_full_name,Guest_Date, Guest_Time,Guest_full_name;

    public Model() {
    }

    public Model(String cc, String resident_full_name, String guest_Date, String guest_Time,String guest_full_name) {
        this.cc = cc;
        Resident_full_name = resident_full_name;
        Guest_Date = guest_Date;
        Guest_Time = guest_Time;
        Guest_full_name= guest_full_name;

    }





    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getResident_full_name() {
        return Resident_full_name;
    }

    public void setResident_full_name(String resident_full_name) {
        Resident_full_name = resident_full_name;
    }

    public String getGuest_Date() {
        return Guest_Date;
    }

    public void setGuest_Date(String guest_Date) {
        Guest_Date = guest_Date;
    }

    public String getGuest_Time() {
        return Guest_Time;
    }

    public void setGuest_Time(String guest_Time) {
        Guest_Time = guest_Time;
    }




    public String getGuest_full_name() {
        return Guest_full_name;
    }

    public void setGuest_full_name(String guest_full_name) {
        Guest_full_name = guest_full_name;
    }
}