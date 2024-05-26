package point;

public class Point {
    /*
    * 코딩 예제: 2차원 좌표 x, y가 있는 Point 클래스 만들기
    *
    * 이 예제에서 여러분은 Java 클래스 Point의 구현을 완료해야 합니다.
    * 2차원 공간에서 점은 x좌표와 y좌표가 있는 실체입니다.
    *
    * 과제
    * 여러분의 과제는 Point 클래스의 다음 메서드들의 구현을 완료하는 것입니다.
    *
    * 메서드: move(int dx, int dy)
    * 이 메서드는 현재 점의 위치를 2차원 공간에서 조정합니다.
    * 매개변수 dx와 dy는 각각 x 좌표와 y 좌표의 변화를 나타냅니다.
    * 이 메서드를 호출한 후에 점의 새로운 좌표는 (current x + dx, current y + dy)가 될 것입니다.
    *
    * 예시: 좌표가 (3, 4)인 점이 있고 인수를 1과 2로 하여 move 메서드를 호출하면 점의 새로운 좌표는 (3+1, 4+2) 즉, (4, 6)이 될 것입니다.
    *
    * 메서드: distanceTo(Point other)
    * 이 메서드는 현재의 점과 또 다른 점 other 사이의 유클리드 좌표계 상의 거리를 계산하여 리턴합니다.
    * 두 점 (x1, y1)과 (x2, y2)의 유클리드 좌표계 상의 거리는 d = sqrt((x2-x1)^2 + (y2-y1)^2)로 계산됩니다.
    * 예시: 만일 좌표가 (3, 4)인 점이 있고 좌표가 (6, 8)인 또 다른 점과의 거리를 계산하고 싶으면
    * 거리는 sqrt((6-3)^2 + (8-4)^2) 즉, sqrt(9+16) 즉, sqrt(25) 즉, 5.0이 됩니다.
    *
    * 팁: Math.sqrt 함수를 사용하여 어떤 숫자의 제곱근을 계산합니다.
    * */

    private int x;  // x-coordinate of the point
    private int y;  // y-coordinate of the point

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
        // Your code here
        this.x += dx;
        this.y += dy;
    }

    // TODO: Implement the method to calculate the distance from this point to another point
    public double distanceTo(Point other) {
        // Your code here
        double distance = Math.sqrt(((other.x - this.x) * (other.x - this.x)) + ((other.y - this.y) * (other.y - this.y)));
        return distance;
    }
}
