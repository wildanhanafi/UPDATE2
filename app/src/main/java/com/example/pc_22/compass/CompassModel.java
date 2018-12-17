package com.example.pc_22.compass;

public class CompassModel {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    private String id;


    public CompassModel(String id, int value) {
        this.id = id;
        this.value = value;
    }

    private int value;

    public CompassModel() {

    }

    private String timestamp;


    public CompassModel(String id, int value, String timestamp) {
        this.id = id;
        this.value = value;
        this.timestamp = timestamp;
    }
}
