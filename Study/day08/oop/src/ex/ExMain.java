package ex;

public class ExMain {
    public static void main(String[] args) {
        /* Q1. 객체 지향 프로그램을 만들어보자
        * 다음은 직사각형이 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하는 프로그램이다.
        * */
        Rectangle square = new Rectangle(5, 8);
        System.out.println("정사각형 여부 : " + square.isSquare());
        System.out.println("넓이 : " + square.calculateArea());
        System.out.println("둘레길이 : " + square.calculatePerimeter());

        /* Q2. 객체 지향 계좌
        * 은행 계좌를 객체로 설계해야 한다.
        * Account 클래스를 만들어라
        *   - int balance : 잔액
        *   - deposit(int amount) : 입금 메서드
        *       - 입금시 잔액이 증가
        *   - withdraw(int amount) : 출금 메서드
        *       - 출금시 잔액이 감소
        *       - 만약 잔액이 부족하다면, 잔액 부족을 출력해야함
        *
        * 계좌에서 10,000원을 입금해라
        * 계좌에서 9,000원을 출금해라
        * 계좌에서 2,000원을 출금 시도해라 -> 잔액 부족 출력을 확인해라
        * 잔고를 출력해라 : 100
        * */
        Account myAccount = new Account();
        myAccount.deposit(10000);
        myAccount.withdraw(9000);
        myAccount.withdraw(2000);
        myAccount.showMoney();

    }
}
