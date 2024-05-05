package ex;

public class Account {
    int balance = 0;

    // 입금 메서드
    void deposit(int amount) {
        balance += amount;
    }
    // 출금 메서드
    void withdraw(int amount) {
        if (amount > balance)
            System.out.println("잔액 부족");
        else
            balance -= amount;
    }
    // 잔고 출력
    void showMoney() {
        System.out.println("잔고 : " + balance);
    }
}
