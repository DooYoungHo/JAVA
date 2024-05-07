package bank;

public class BankAccount {

    private int balance;
    // 생성자
    public BankAccount() {
        balance = 0;
    }
    // public 메서드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount))
            balance += amount;
        else
            System.out.println("유효하지 않은 금액입니다!");
    }
    // 올바른 금액 체크하는 메서드 : private (사용자가 신경 쓸 필요 없음)
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && (balance - amount) > 0) {
            balance -= amount;
        }
        else
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다!");
    }
    // public 메서드 : 잔액 확인
    public int getBalance() {
        return balance;
    }
}
