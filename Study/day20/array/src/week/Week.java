package week;

public class Week {
    private String[] weekDay;

    public Week(String... week) {
        this.weekDay = week;
    }

    public String longestLetters() {

        String longWeek = weekDay[0];

        for (String week : weekDay) {
            if (longWeek.length() < week.length()) {
                longWeek = week;
            }
        }

        return longWeek;
    }

    public void printBackWards() {
        for (int i = (weekDay.length - 1); i >= 0; i--)
            System.out.println(weekDay[i]);
    }
}
