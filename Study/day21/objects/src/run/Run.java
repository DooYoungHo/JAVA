package run;

import abstractrecipe.Recipe1;
import address.Address;
import customer.Customer;
import fan.Fan;

public class Run {
    public static void main(String[] args) {

        Fan fan = new Fan("Samsung", 0.9, "Black");

        System.out.println(fan);

        Recipe1 recipe1 = new Recipe1();
        recipe1.execute();
    }
}
