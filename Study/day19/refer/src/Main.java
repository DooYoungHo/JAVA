import stringmagic.StringMagic;

import java.time.LocalDate;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String someString = "This is a lot of Text";

        for (int i = 0; i < someString.length(); i++) {
            System.out.println(someString.charAt(i));
        }

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2.getDayOfYear());

        StringMagic stringMagic = new StringMagic();

        System.out.println(stringMagic.hasConsecutiveDuplicates("hell"));
    }
}