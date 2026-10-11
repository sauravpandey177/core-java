package inheritance;

class Student{
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendence marked.");
    }
}

class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("lab attended. ");
    }
}

class CSEEngineeringStudent extends EngineeringStudent{
    void cseLab(){
        System.out.println("cse lab attended.");
    }
}


public class basics {
    static void main() {
        EngineeringStudent e1 = new EngineeringStudent();
        CSEEngineeringStudent cs1 = new CSEEngineeringStudent();
        cs1.cseLab();


    }
}
