package com.example.tms_06;

public class SrModel {
    String type,description,id;

    public SrModel() {
    }

    public SrModel(String type, String description,String id) {
        this.type = type;
        this.description = description;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {this.type = type;}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}