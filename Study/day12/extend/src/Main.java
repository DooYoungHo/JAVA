import ext.*;

public class Main {

    public static void main(String[] args) {

        GasCar gasCar = new GasCar();
        ElectricCar elecCar = new ElectricCar();

        gasCar.charge();
        elecCar.charge();

        /* 자바 클래스 UML 표기법
        * - + : public
        * - # : protected
        * - ~ : default
        * - - : private
        * */
    }
}
