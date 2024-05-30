package student;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private String name;
    private int[] listOfMarks;

    public Student(String name, int[] list) {
        this.name = name;
        this.listOfMarks = list;
    }

    public int getNumberOfMarks() {
        return listOfMarks.length;
    }

    public int getTotalSumOfMarks() {

        int totalSum = listOfMarks[0];

        for (int list : listOfMarks) {
            totalSum += list;
        }

        return totalSum;
    }

    public int getMaximumMark() {

        int maxNum = listOfMarks[0];

        for (int list : listOfMarks) {
            if (list >= maxNum)
                maxNum = list;
        }

        return maxNum;
    }

    public int getMinimumMark() {
        int minNum = 0;

        // 0 1 2
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

        return sum.divide(num, 2, RoundingMode.HALF_UP);
    }
}
