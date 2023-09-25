package com.example.penetration;

public class IPad implements Device {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModelDevice() {
        return model;
    }
}
