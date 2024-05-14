package driver;

public class Main {

    public static void main(String[] args) {

        K3Car k3 = new K3Car();
        AvanteCar avante = new AvanteCar();

        Driver driver = new Driver(k3);

        driver.drive();
    }
}
