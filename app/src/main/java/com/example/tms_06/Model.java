package com.example.tms_06;

import static com.example.tms_06.GlobalVar.name;

public class Model {
    String Guest_full_name,Guest_Date,Guest_Time;


    public Model() {}

    public Model(String guest_full_name, String guest_Date, String guest_Time) {
        Guest_full_name = guest_full_name;
        Guest_Date = guest_Date;
        Guest_Time = guest_Time;
    }

    public String getGuest_full_name() {
        return Guest_full_name;
    }

    public void setGuest_full_name(String guest_full_name) {
        Guest_full_name = guest_full_name;
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
}
