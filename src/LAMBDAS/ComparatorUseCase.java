package LAMBDAS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUseCase {
    static void main() {
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("saurav", 11, "delhi"));
        employees.add(new Employee("akash", 23, "pune"));
        employees.add(new Employee("ravi", 3, "ujjain"));

        Collections.sort(employees, new sortByName());
        for(Employee e: employees) {
            System.out.println(e.name + " " + e.rollNo + " " + e.address);
        }

        System.out.println();


        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.rollNo-o2.rollNo;
            }
        });

        for(Employee e: employees) {
            System.out.println(e.name + " " + e.rollNo + " " + e.address);
        }

    }
}

class sortByName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

//class sortByRollNo implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.rollNo-o2.rollNo;
//    }
//}

class Employee{
    String name;
    int rollNo;
    String address;

    Employee(String name, int rollNo, String address){
        this.name = name;
        this.rollNo= rollNo;
        this.address = address;
    }
}
