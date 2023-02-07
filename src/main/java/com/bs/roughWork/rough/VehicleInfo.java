package com.bs.roughWork.rough;

public class VehicleInfo {
    double number;

    public double getVehicleNumber() {
        return this.number();//default
    }

    private double number() {
        return this.number;
    }
}

class Car extends VehicleInfo {
    @Override
    public double getVehicleNumber() {
        return super.getVehicleNumber();
    }
}

class Bike extends VehicleInfo {
    @Override
    public double getVehicleNumber() {
        return super.getVehicleNumber();
    }
}

class Truck extends VehicleInfo {
    @Override
    public double getVehicleNumber() {
        return super.getVehicleNumber();
    }
}