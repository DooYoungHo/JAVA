package driver;

public class K3Car implements Drive {

    @Override
    public void startEngine() {
        System.out.println("K3 운전을 시작합니다...!");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3 엑셀을 밟습니다...!");
    }

    @Override
    public void offEngine() {
        System.out.println("K3 운전을 종료합니다...!");
    }

    public void drive() {
        startEngine();
        pressAccelerator();
        offEngine();
    }
}
