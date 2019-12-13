package javaobjectorientprograming.Interface;

public class Bus extends LandVehicle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus is starting the engine");
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }


    public void fourWheelDrive(){
        System.out.println("This tuck is a four wheel drive");
    }

}
