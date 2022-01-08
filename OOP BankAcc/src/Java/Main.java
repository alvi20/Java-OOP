package Java;



public class Main {

    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        account.name="Alvi";
        account.id="232432424";
        account.balance=200000;

        System.out.println("Balance before deposit: "+account.balance);

        account.deposit(400000);

        System.out.println("Balance after deposit: "+account.balance);
	// write your code here
    }
}
