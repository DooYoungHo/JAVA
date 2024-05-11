public class PolyMain {

    public static void main(String[] args) {

        // 자식 변수가 자식 객체 참조
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 객체 참조
        Parent parent = new Child();
        parent.parentMethod();
        System.out.println("--------------------------------");
        // 자식 메서드는 사용할 수 없음 -> 다운 캐스팅을 사용하면 쓸 수 있음
        Child child2 = (Child) parent;
        child2.childMethod();

        // 업캐스팅과 다운캐스팅
        Parent parent1 = (Parent) child; // 업캐스팅은 생략가능, 생략 권장
        Parent parent2 = child; // 업캐스팅 생략
        System.out.println("--------------------------------");
        // instanceof
        Parent par = new Parent();
        call(par);
        Parent par2 = new Child();
        call(par2);

    }

    private static void call(Parent parent) {
        // Child 인스턴스를 포함하고 있으면
        if (parent instanceof Child) {
            System.out.println("Child Instance...!");
            // 다운캐스팅 가능
            Child child = (Child) parent;
            child.childMethod();
        }
        else {
            System.out.println("Not Child Instance...!");
        }
    }
}
