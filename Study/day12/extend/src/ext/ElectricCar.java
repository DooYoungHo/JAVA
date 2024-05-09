package ext;

public class ElectricCar extends Car {

    @Override       // @ 에노테이션
    public void charge() {
        System.out.println("전기를 충전합니다...!");
    }
}
