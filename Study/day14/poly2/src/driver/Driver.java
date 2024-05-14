package driver;

public class Driver {

    private Drive car;

    Driver(Drive car) {
        System.out.println("자동차를 설정합니다." + car);
        this.car = car;
    }

    public void drive() {
        car.startEngine();
        car.pressAccelerator();
        car.pressAccelerator();
    }
}
