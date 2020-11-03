package m_mehdi;

/**
 * shape class with overwritten methods
 */

public class Shape {

    public Shape (){
    }

    /**
     * method to calculate perimeter
     * @return
     */
    public double calculatePerimeter() {
        return 0;
    }

    /**
     * method to calculate area
     * @return
     */
    public double calculateArea() {
        return 1;
    }

    /**
     * method to draw shapes
     */
    public void draw() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
    }

    /**
     * overridden from object class to output String
     * @return ""
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * overridden from object class to check equality
     * @return ""
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
