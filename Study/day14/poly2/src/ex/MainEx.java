package ex;

import ex.ex1.EmailSender;
import ex.ex1.FaceBookSender;
import ex.ex1.Sender;
import ex.ex1.SmsSender;

import ex.ex2.*;

public class MainEx {

    public static void main(String[] args) {

        /* Q1. 다중 메시지 발송
        * 한번에 여러 곳에 메시지를 발송하는 프로그램을 만들어보자
        * 다음 코드를 참조해서 클래스를 완성하자
        *
        * 요구사항
        *   - 다형성을 활용하세요
        *   - Sender 인터페이스를 활용하세요
        *   - EmailSender, SmsSender, FaceBookSender 를 구현하세요
        *  */
        Sender[] senders = {new EmailSender(), new SmsSender(), new
                FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }

        /* Q2. 결제 시스탬 개발
        *
        * 기대하던 결제 시스템 개발팀에 입사하게 되었다.
        * 이 팀은 현재 2가지 결제 수단을 지원한다. 앞으로 5개의 결제 수단을 추가로 지원할 예정이다.
        * 새로운 결제수단을 쉽게 추가할 수 있도록, 기존 코드를 리팩토링 해라
        *
        * 요구사항
        *   - OCP 원칙을 지키세요.
        *   - 메서드를 포함한 모든 코드를 변경해도 됩니다. 클래스나 인터페이스를 추가해도 됩니다.
        *   - 단, 프로그램을 실행하는 PayMain0 코드는 변경하지 않고, 그대로 유지해야 합니다.
        *   - 리펙토링 후에도 결과는 같아야 합니다.
        * */

        PayService payService = new PayService();
        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);
        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);
    }
}
