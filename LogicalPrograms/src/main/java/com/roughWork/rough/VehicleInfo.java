package com.roughWork.rough;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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