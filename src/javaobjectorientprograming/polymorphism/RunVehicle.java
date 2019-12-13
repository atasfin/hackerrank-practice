package javaobjectorientprograming.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class RunVehicle {
    public static void main(String[] args) {
        Vehicle truck = new Truck();
        Vehicle bus = new Bus();
        Vehicle vehicle = new Vehicle();

        Vehicle vehicles[] = new Vehicle[3];
        vehicles[0] = truck;
        vehicles[1] = bus;
        vehicles[2] = vehicle;

        for(int x = 0; x<vehicles.length; x++){
            vehicles[x].typesOfVehicle();
        }

    }
}
