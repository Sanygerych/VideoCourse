package Lesson5;

public class Human {
    String name;
    Car4 car;
    BankAccount bA;

    void info() {
        System.out.println("Name: " + name + ", color car: " + car.color +
                ", Balance bankovskogo cheta: " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name="David";
        h.car=new Car4("red", "v8");
        h.bA = new BankAccount(18, 200.5);
        h.info();
    }
}


class Car4{
    Car4 (String c, String e) {
        color=c;
        engine=e;
    }
    String color;
    String engine;
}

class BankAccount {
    BankAccount (int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}
