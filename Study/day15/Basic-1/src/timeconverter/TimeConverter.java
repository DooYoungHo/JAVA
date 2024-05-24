package timeconverter;

public class TimeConverter {

    public static int convertHoursToMinutes(int hours) {
        if (hours < 0)
            return -1;
        return hours * 60;
    }

    public static int convertDaysToMinutes(int days) {
        if (days < 0)
            return -1;
        return days * 24 * 60;
    }

    public static void main(String[] args) {

        /*
        * 코딩 예제: 시간 변환기
        *
        * Java에서 시간 또는 날짜를 분으로 변환하는 일부 구현된 TimeConverter 클래스가 제공되어 있습니다.
        * TimeConverter 클래스에는 완성해야 하는 정적 메서드가 2개 있습니다.
        *
        * convertHoursToMinutes(int hours): 이 메서드는 시간을 나타내는 정수 값을 받아서 분 단위로 된 동등한 값을 리턴해야 합니다.
        * convertDaysToMinutes(int days): 이 메서드는 날짜를 나타내는 정수 값을 받아서 분 단위로 된 동등한 값을 리턴해야 합니다.
        *
        * 지침
        *
        * 과제 1: TimeConverter클래스 안에서 convertHoursToMinutes 메서드를 완성하여 정확히 시간을 분으로 변환하십시오.
        * 메서드는 총 분 수를 나타내는 정수 값을 리턴해야 합니다.
        *
        * 과제 2: TimeConverter클래스 안에서 convertDaysToMinutes메서드를 완성하여 정확히 날짜를 분으로 변환하십시오.
        * 메서드는 총 분 수를 나타내는 정수 값을 리턴해야 합니다.
        *
        * 참고사항: 유효하지 않은 경우에는 -1을 리턴합니다(날짜와 시간이 1보다 작은 경우).
        * */

        int days = convertDaysToMinutes(3);
        int hours = convertHoursToMinutes(3);

    }
}
