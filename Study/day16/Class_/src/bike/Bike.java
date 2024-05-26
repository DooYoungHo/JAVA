package bike;

public class Bike {

    int speed;
    int gear;

    public Bike() {
        this.speed = 0;
        this.gear = 0;
    }

    public void stepOnAccel() {
        if (speed >= 0 && speed < 4) {
            this.speed += 1;
            System.out.println(speed + "단 입니다.");
        }

        else if (speed == 4)
            System.out.println("최고 속력입니다.");
    }

    public void stepOnBreak() {
        if (speed > 0 && speed <= 4) {
            speed -= 1;
            System.out.println(speed + "단 입니다.");
        }

        else if (speed == 0) {
            System.out.println("오토바이가 멈추었습니다.");
        }
    }

}
