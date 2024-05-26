package rgb;

public class RGBColor {

    /*
    * 코딩 예제: RGB Color 클래스
    *
    * RGB(Red-Green-Blue) 모델은 컴퓨터 시스템에서 색상을 나타내기 위해 널리 사용되는 방식입니다.
    * 이 모델에서 모든 색상은 기본 색상인 적색, 녹색, 청색의 조합으로 표현됩니다.
    * 이러한 기본 색상은 모두 0부터 255까지의 강도 값을 가질 수 있습니다.
    *
    * 이 예제에서 여러분은 색상을 RGB 모델로 모델링하는 RGBColor 클래스를 완성하게 됩니다.
    * 이 클래스는 적색, 녹색, 청색 강도에 관한 필드가 있고 그러한 값을 받기 위한 메서드가 있습니다.
    *
    * 또한 invert 메서드가 있어서 색상을 보색(컬러 휠의 반대쪽에 있는 색상)으로 변경합니다.
    * 여러분은 생성자, 적색, 녹색, 청색 값에 대한 게터 메서드, invert 메서드를 구현해야 합니다.
    *
    * invert 메서드는 각 기본 색상의 현재 강도 값을 255에서 빼서 보색을 얻어야 합니다.
    *
    * 제공된 코드 골격을 따라 진행하면서 누락된 부분을 채워 보세요.
    *
    * 지침
    * 먼저 RGBColor 클래스의 생성자부터 구현합니다. 생성자는 red, green, blue 등 3개의 인수를 받아야 합니다.
    * 그것들을 사용하여 클래스의 red, green, blue 필드를 초기화해야 합니다.
    *
    * getRed, getGreen, getBlue 메서드를 구현합니다. 이 메서드들은 각각 red, green, blue 필드의 현재 값들을 리턴해야 합니다.
    * invert 메서드를 구현합니다. 이 메서드는 red, green, blue 필드 각각의 현재 값을 255에서 빼고 결과를 다시 해당 필드에 할당해야 합니다.
    * */

    // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public RGBColor(int red, int green, int blue) {
        // write your code here
        if (red >= 0 && green >= 0 && blue >= 0) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
    }

    // Getter method to get the red value of the color.
    public int getRed() {
        // write your code here
        return this.red;
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
        // write your code here
        return this.green;
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
        // write your code here
        return this.blue;
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        // write your code here
        this.red = (255 - this.red);
        this.green = (255 - this.green);
        this.blue = (255 - this.blue);
    }
}
