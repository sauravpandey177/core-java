package AbstractMthdandClass;

public class abstractBasics {
    static void main() {
        System.out.println();
        Car car = new FuelCar();
        car.accelerate();
        car.brake();
        car.start();
    }
}

abstract class Car{
    void start(){
        System.out.println("car started");
    }

    abstract void accelerate();

    abstract void brake();

}

class FuelCar extends Car{
    @Override  // not mandatory to write override here
    void accelerate() {
        System.out.println("fuelCar accelerate is defined here.");
    }

    void brake(){
        System.out.println("fuelCar brake is defined");
    }
}

class ElectricCar extends Car{
    @Override
    void accelerate() {
        System.out.println("accelerate is defined here");
    }
    void brake(){
        System.out.println("brake is defined");
    }
}
