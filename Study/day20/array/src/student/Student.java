package student;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

    private final String name;
    private ArrayList<Integer> listOfMarks;

    public Student(String name, int... list) {
        this.name = name;
        listOfMarks = new ArrayList<>();

        for (int num : list) {
            listOfMarks.add(num);
        }
    }

    public void getListOfMarks() {
        for (int list : listOfMarks)
            System.out.println(list);
    }

    public String getName() { return name; }

    public int getNumberOfMarks() {
        return listOfMarks.size();
    }

    public int getTotalSumOfMarks() {

        int totalSum = 0;

        for (int list : listOfMarks) {
            totalSum += list;
        }

        return totalSum;
    }

    public int getMaximumMark() {

        int maxNum = 0;

        for (int list : listOfMarks) {
            if (list >= maxNum)
                maxNum = list;
        }

        return maxNum;
    }

    public int getMinimumMark() {
        int minNum = 0;

        for (int list : listOfMarks) {
            if (minNum >= list)
                minNum = list;
        }
        return minNum;
    }

    public BigDecimal getAverageMarks() {

        int totalSum = getTotalSumOfMarks();
        int numberOfMarks = getNumberOfMarks();

        BigDecimal sum = new BigDecimal(totalSum);
        BigDecimal num = new BigDecimal(numberOfMarks);

        return sum.divide(num, 1, RoundingMode.HALF_UP);
    }

    public void addNewMarks(int... num) {
        for (int n : num)
            listOfMarks.add(n);
    }

    public void removeIndexMarks(int num) {
        if (num <= listOfMarks.size() - 1)
            listOfMarks.remove(num);
        else
            System.out.println("Not used Index...");
    }
}
