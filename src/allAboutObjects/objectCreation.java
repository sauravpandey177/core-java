package allAboutObjects;


class Car{
    String name;
    String color;
    String brand;
    int price;

    void start(){
        System.out.println("car is starting...");
    }

    void stop(){
        System.out.println("car is stopping...");
    }

    void accelerate(){
        System.out.println("car's speed is increasing...");
    }

    void print(){
        System.out.println("name: "+ name + "\n"+"brand: "+ brand +"\n" + "color: "+ color +"\n" + "price: "+price);
        System.out.println("----------------------------------");
    }

    // DEFAULT CONSTRUCTOR ****
    Car(){
        System.out.println("this is default constructor!");
    }

    Car(String name, String brand){
        this(name, "null", brand, 0);
        System.out.println("2 parameters constructor called");
    }

    //PARAMETERISED CONSTRUCTOR ****
    Car(String name, String color, String brand, int price){
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.price = price;

        System.out.println("4 parameters constructor called");

//        name = n;
//        color = c;
//        brand = b;
//        price = p;

//        name = "four wheeler";
//        brand = "TATA motors";
//        price = 350000;
    }

}


public class objectCreation {
    static void main() {
        String n = "audiR8";
        String c = "rosted green";
        String b = "audi";
        int p = 4500000;

        Car c1 = new Car(n,c,b,p);
        c1.print();

//        Car bmw = new Car();
//        bmw.name = "bmw x90";
//        bmw.brand = "bmw";
//        bmw.color = "white";
//        bmw.print();
//
//        Car c2 = new Car();
//        c2.name = "fortuner";
//        c2.color = "black";
//        c2.brand = "bbt";
//        c2.print();

        Car c2 = new Car("saurav","rolex");
        c2.print();




    }
}
