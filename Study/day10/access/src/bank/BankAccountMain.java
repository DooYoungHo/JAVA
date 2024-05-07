package bank;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount();
        bank.deposit(10000);
        System.out.println("현재 잔액 : " + bank.getBalance());
        bank.deposit(20000);
        System.out.println("현재 잔액 : " + bank.getBalance());
        bank.withdraw(5000);
        System.out.println("현재 잔액 : " + bank.getBalance());
    }
}
