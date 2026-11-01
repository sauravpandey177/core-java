package LAMBDAS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUseCase {
    static void main() {
        List<Student> students = new ArrayList<>();
//        Student s1 = new Student("saurav", 1, "delhi");
//        Student s2 = new Student("akash", 2, "pune");
//        Student s3 = new Student("ravi", 3, "ujjain");
//        students.add(s1);


        students.add(new Student("saurav", 11, "delhi"));
        students.add(new Student("akash", 23, "pune"));
        students.add(new Student("ravi", 3, "ujjain"));

        Collections.sort(students);
        for(Student s: students){
            System.out.println(s.address + " "+s.rollNo);
        }

    }
}

class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        return this.address.compareTo(o.address);
    }


    String name;
    int rollNo;
    String address;

    Student(){}

    Student(String name, int rollNo, String address){
        this.name = name;
        this.rollNo= rollNo;
        this.address = address;
    }
}

