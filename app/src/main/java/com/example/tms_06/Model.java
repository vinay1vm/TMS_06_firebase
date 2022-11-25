package com.example.tms_06;

public class Model {
    String id,name,dat,tim;

    public Model() {
    }

    public Model(String id, String name, String dat, String tim) {
        this.id = id;
        this.name = name;
        this.dat = dat;
        this.tim = tim;
    }

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

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim;
    }
}
