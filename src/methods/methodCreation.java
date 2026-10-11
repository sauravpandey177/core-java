package methods;

public class methodCreation {

    static void print(){
        System.out.println("hie,, this is print function !");
        return;
    }
// method overloading --> method having same name but have diff no. of perimeters,dataype and order.
    static int sum(int a , int b){ // a and b are parameters
        return a+b;
    }

    static double sum(double a , double b ){
        return a+b;

    }

    static int sum(int a , int b , int c){
        return a+b+c;
    }


    public static void main(String[] args){
        print();
        System.out.println(sum(12,3)); // 2 and 3 are arguments
        System.out.println(sum(23,12,4));
        System.out.println(sum(12.32, 22.433));

    }
}
