package ex.ex1;

public class FaceBookSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Facebook을 발송합니다 : " + message);
    }
}
