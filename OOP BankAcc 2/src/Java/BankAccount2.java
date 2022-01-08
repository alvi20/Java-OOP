package Java;

public class BankAccount2 {
    String name,id;
    double balance;

    void deposit(double amount){
        balance=balance+amount;
    }

    void withdraw(double amount){
        if(amount<balance)
            balance-=amount;
    }
}
