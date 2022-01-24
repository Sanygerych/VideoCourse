package Homework.Lesson5;

import Lesson4.BankAccount;

public class BankAccount1 {

    int id;
    String name;
    double balance;

    void popolnenieBalanca (double summapopolnenieScheta) {
        System.out.println(id + ". " + name);
        System.out.println("Balancs do popolneniya: " + balance + "$");
        System.out.println("Balans poplnyetsya na: " + summapopolnenieScheta + "$");
        balance+=summapopolnenieScheta;
        System.out.println("Balans pocle popolneniya: " + balance + "$");
        System.out.println();
    }

    void snyatieSoScheta (double summaSnyatiya) {
        System.out.println(id + ". " + name);
        System.out.println("Balancs do snytiya: " + balance + "$");
        System.out.println("Balans umenshaetsya na: " + summaSnyatiya + "$");
        balance-=summaSnyatiya;
        System.out.println("Balans pocle snyatiya: " + balance + "$");
        System.out.println();
    }
}

class BankAccount1Test {

    public static void main(String[] args) {

        BankAccount1 MyAccount = new BankAccount1();
        BankAccount1 YourAccount = new BankAccount1();
        BankAccount1 HisAccount = new BankAccount1();

        MyAccount.id = 1;
        MyAccount.name = "Sasha";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        MyAccount.snyatieSoScheta(10.35);
        YourAccount.popolnenieBalanca(11.25);
        HisAccount.snyatieSoScheta(64.43);
        HisAccount.popolnenieBalanca(38.89);


    }
}

