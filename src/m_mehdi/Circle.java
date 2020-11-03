package m_mehdi;
/**
 class for Circle
 */

public class Circle extends Shape {
    int radius;
    public Circle (int radius) {
        super();
        this.radius = radius;
    }
    /**
     method to get radius of Circle
     */
    public int getRadius() {
        return this.radius;
    }
    /**
     * method to calculate perimeter of Circle
     * @return perimeter
     */
    public double calculatePerimeter() {

        return (radius * 2) * Math.PI;
    }
    /**
     * method to calculate area of Circle
     * @return area
     */
    public double calculateArea() {
        return (radius * radius) * Math.PI;
    }
    /**
     * method to cast to string
     * @return radius
     */
    @Override
    public String toString() {
        return "Circle: radius:" + radius;
    }
}
