package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

}

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Sasha";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        System.out.println(YourAccount.id);
    }
}
