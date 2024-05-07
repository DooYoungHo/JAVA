package first;

public class AccessData {

    public int publicField;         // 어디서든 접근 가능 접근 제어자 public
    int defaultField;               // 같은 패키지 내에서만 접근 가능한 접근 제어자 default
    private int privateField;       // 클래스 내에서만 접근 가능한 접근 제어자 private

    // 메서드도 마찬가지
    public void publicMethod() {
        System.out.println("publicMethod 호출 : " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 : " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 : " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출...!");
        publicField = 100;
        defaultField = 200;
        privateField = 300;     // 클래스 내에서 접근하기 때문에 접근 가능함
        publicMethod();
        defaultMethod();
        privateMethod();     // 클래스 내에서 접근하기 때문에 접근 가능함
    }
}
