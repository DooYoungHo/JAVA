package rectangle;

import java.math.BigDecimal;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) { this.length = length; }

    public void setWidth(double width) { this.width = width; }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return (width * length) * 2;
    }

    public BigDecimal getArea() {
        return new BigDecimal(length).multiply(new BigDecimal(width));
    }

    public String toString() {
        return String.format("Length : %f, Width : %f", length, width);
    }

}
