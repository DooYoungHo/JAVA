package first;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 ( 어디서든 접근 가능 )
        data.publicField = 5;
        data.publicMethod();
        // default 호출 ( 같은 패키지 내 접근 가능 )
        data.defaultField = 10;
        data.defaultMethod();
        // private 호출 불가 ( 클래스 내에서만 접근 가능 )
        // data.privateField = 3;
        // data.privateMethod();
        data.innerAccess();
    }
}
