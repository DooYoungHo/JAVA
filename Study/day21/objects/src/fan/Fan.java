package fan;

// 선풍기 클래스
public class Fan {

    // state (Member variable)
    private String make;
    private String color;
    private double radius;
    private boolean isOn;
    private byte speed; // 1 ~ 5 세기

    // Constructors
    public Fan() {
        this("천장형",3.14,"Black");
        this.speed = 0;
        this.isOn = false;
    }

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
        this.speed = 0;
        this.isOn = false;
    }

    // Behavior (Member Methods)
    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
        changeSpeed((byte)0);
    }

    public void changeSpeed(byte speed) {
        if (speed < 0 || speed > 5)
            System.out.println("Wrong Speed");
        else
            this.speed = speed;
    }

    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed %d",
                        make, radius, color, isOn, speed);
    }
}
