package allAboutObjects;

class A{
    void print(){
        System.out.println("hie this is class A");
    }
}

public class staticAndNonStaticClass {     //outer class
    class Rangers{                // nested inner class
        void display(){
            System.out.println("hie this is class rangers");
        }
    }

    static void main() {
        System.out.println("hiee, this is main class. ");
        A a = new A();
        a.print();
        // if inner class is non-static then below code is useful. elsewise we dont need to outer class object.
        staticAndNonStaticClass outer = new staticAndNonStaticClass();
        Rangers inner = outer.new Rangers();
        inner.display();
    }


}


