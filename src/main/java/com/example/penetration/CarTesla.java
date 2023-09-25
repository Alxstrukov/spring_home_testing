package com.example.penetration;

public class CarTesla implements Car {
    private String model;
    private int age;
    private Device device;

    @Override
    public String getDevice() {
        return device.getModelDevice();
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setModel(String model) {
        if (model.toLowerCase().equals("x11")) {
            this.model = "Model X";
        } else {
            this.model = model;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getCarModel() {
        return model;
    }

    @Override
    public int getCarAge() {
        return age;
    }
}
