package Java;

public class Main {

    public static void main(String[] args) {
        BankAccount2 account2=new BankAccount2();

        account2.name="MD.Ahanaf Mubashshir Alvi";
        account2.id="011202262";
        account2.balance=80000;

        System.out.println("Balance before deposit: "+account2.balance);

        account2.deposit(20000);

        System.out.println("Balance after deposit: "+account2.balance);

        System.out.println();

        BankAccount2 account3=new BankAccount2();

        account3.name="Mohammad Salah";
        account3.id="023934393";
        account3.balance=500045;

        System.out.println("Balance before deposit: "+account3.name);

        account3.deposit(404495);

        System.out.println("Balance after deposit: "+account3.balance);
        // write your code here
    }
}
