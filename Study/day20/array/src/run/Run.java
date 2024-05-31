package run;

import arrmagic.ArrayMagic;
import student.Student;
import week.Week;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {

        Student stu1 = new Student("Youngho",50,60,70);
        Student stu2 = new Student("YuJin",90,80);
        Student stu3 = new Student("Babo",10,80,50);

//        stu1.addNewMarks(80, 90);
//        stu1.removeIndexMarks(100);
//        stu1.removeIndexMarks(0);
//        stu1.getListOfMarks();

//        Week week = new Week("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
//        System.out.println(week.longestLetters());
//        week.printBackWards();
//
//        Week week2 = new Week("ABCDEFG", "AAAABBBBCCCC");
//        System.out.println(week2.longestLetters());
//        week2.printBackWards();
        System.out.println(ArrayMagic.findSecondLargestElement(new int[]{10, 11, 9, 7}));
        System.out.println(ArrayMagic.findSecondLargestElement(new int[]{10, 15, 9, 13}));

        System.out.println(ArrayMagic.isSorted(new int[]{1,2,3,4,5}));
        System.out.println(ArrayMagic.isSorted(new int[]{1,3,2,4,5}));
        System.out.println(ArrayMagic.isSorted(new int[]{1}));
    }
}
