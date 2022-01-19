package Homework.Lesson5;

import Lesson4.BankAccount;

public class BankAccount1 {

    int id;
    String name;
    double balance;

    double popolnenieScheta(double summa) {
        balance+=summa;
        return balance;
    }

    double snytieSoScheta(double summa) {
        balance-=summa;
        return balance;
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

        MyAccount.snytieSoScheta(10.35);
        System.out.println(MyAccount.balance);

        YourAccount.popolnenieScheta(11.25);
        System.out.println(YourAccount.balance);

        HisAccount.snytieSoScheta(65.43);
        HisAccount.popolnenieScheta(38.89);
        System.out.println(HisAccount.balance);

    }
}
