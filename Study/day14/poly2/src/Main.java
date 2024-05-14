public class Main {

    public static void main(String[] args) {

        /* OCP(Open Closed Principle) 원칙
        * - Open for extension : 새로운 기능의 추가나 변경 사항이 생겼을 때, 기존 코드는 확장할 수 있어야 한다.
        * - Closed for modification : 기존의 코드는 수정되지 않아야 한다.
        *
        * 확장에는 열려있고, 변경에는 닫혀 있다는 뜻인데, 쉽게 이야기해서 기존의 코드 수정 없이
        * 새로운 기능을 추가할 수 있다는 의미이다. driver 패키지에 있는 Drive 인터페이스를 사용하는
        * Driver 클래스이 코드는 전혀 변경되지 않는다. 기능을 확장해도 main() 일부분을 제외하고는 코드를
        * 변경하지 않아도 된다.
        * */
    }
}
