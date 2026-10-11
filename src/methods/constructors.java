package methods;

public class constructors {
    static void main() {
        Student s= new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println();

        Student s1= new Student("ram",423);
        System.out.println(s1.name);
        System.out.println(s1.age);


    }
}

class Student{
    String name;
    int age;

    Student(){   //default constructor
        this("sam",43);
        System.out.println("this is default constructor");
    }


    Student(String sname, int sage){  //parameterised constructor
        System.out.println("para const: "+sage);

    }
}
