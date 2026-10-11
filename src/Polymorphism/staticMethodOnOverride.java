package Polymorphism;

public class staticMethodOnOverride {
    static void main() {
        A a = new B();
        a.fun();
        a.print();



    }
}

class A{
    static void fun(){
        System.out.println("hello");
    }
    void print(){
        System.out.println("can u override without final mthd?");
    }

    final void cantOverride(){
        System.out.println("final mthd it is.");
    }

    private void privateMethod(){
        System.out.println("this is private method");
    }

}

class B extends A{
    static void fun(){
        System.out.println("Bye");
    }
    void print(){
        System.out.println("i can override without final mthd");
    }

    void privateMethod(){
        System.out.println("hiee");

    }

}
