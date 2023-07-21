package com.qa.garage;

import com.qa.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles;

    public Garage(List<Vehicle> vehicles) {
        super();
        this.vehicles = vehicles;
    }

    public boolean addVehicle(Vehicle vehicle) {
        return this.vehicles.add(vehicle);
    }

    public boolean removeVehicle(int id) {
        for (Vehicle v : this.vehicles) {
            if (v.getId() == id) {
                return this.vehicles.remove(v);
            }
        }
        return false;
    }

    public boolean removeVehicleByType(String type) {
        ArrayList<Vehicle> toRemove = new ArrayList<>();

        for (Vehicle v : this.vehicles) {
            if (v.getClass().getSimpleName().equals(type)) {
                toRemove.add(v);
            }
        }

        return this.vehicles.removeAll(toRemove);
    }

    public boolean removeVehicleByType(Class<?> clazz) {
        ArrayList<Vehicle> toRemove = new ArrayList<>();

        for (Vehicle v : this.vehicles) {
            if (v.getClass() == clazz) {
                toRemove.add(v);
            }
        }

        return this.vehicles.removeAll(toRemove);
    }


    public boolean empty() {
        this.vehicles.clear();
        return this.vehicles.size() == 0;
    }

    @Override
    public String toString() {
        return "Garage [vehicles=" + vehicles + "]";
    }

}