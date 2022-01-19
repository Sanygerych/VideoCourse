package Homework.Lesson5;

public class Employee {

    int ID;
    String Surname;
    int age;
    double salary;
    String Department;

    double newSalary(double kooficent) {
        salary*=kooficent;
        return salary;
    }

    void showInfo() {
        System.out.println("ID " + ID + ". " + Surname + ", " + age + "  years old, " +
                "Department " + Department + ", salary - " + salary + "$");
    }
}

class EmployeeTest  {
    public static void main(String[] args) {

     Employee emp1 = new Employee();
     Employee emp2 = new Employee();

     emp1.ID = 1;
     emp1.Surname = "Moriss";
     emp1.age = 25;
     emp1.salary = 5250.75;
     emp1.Department = "of Economics";
     emp1.newSalary(2);
     emp1.showInfo();

     emp2.ID = 2;
     emp2.Surname = "Philips";
     emp2.age = 27;
     emp2.salary = 5123.43;
     emp2.Department = "accounting";
     emp2.newSalary(2);
     emp2.showInfo();

    }
}