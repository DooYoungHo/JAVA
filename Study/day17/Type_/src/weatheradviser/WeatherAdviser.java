package weatheradviser;

public class WeatherAdviser {
    /*
    * 코딩 예제: 날씨 알리미
    *
    * 과제
    * 여러분의 과제는 WeatherAdviser 클래스 안에 provideWeatherAdvisory(int temperature) 메서드를 구현하는 것입니다.
    * provideWeatherAdvisory(int temperature)– 이 메서드는 매개변수 하나,
    * 즉 temperature(정수)를 받을 것이고, 다음의 지침에 따라 입을 옷에 대한 조언이 담긴 문자열을 리턴할 것입니다.
    *
    * temperature가 0보다 낮은 경우, "It's freezing! Wear a heavy coat."를 리턴합니다.
    * temperature가 0과 10 사이이면(10 포함) "It's cold! Bundle up."을 리턴합니다.
    * temperature가 11과 20 사이이면(20 포함) "It's cool! A light jacket will do."를 리턴합니다.
    * temperature가 20을 넘으면 "It's warm! Enjoy the day."를 리턴합니다.
    * */
    public String provideWeatherAdvisory(int temperature) {
        if (temperature < 0) {
            return "It's freezing! Wear a heavy coat.";
        }
        else if (temperature <= 10) {
            return "It's cold! Bundle up.";
        }
        else if (temperature <= 20) {
            return "It's cool! A light jacket will do.";
        }
        else {
            return "It's warm! Enjoy the day.";
        }
    }
}
