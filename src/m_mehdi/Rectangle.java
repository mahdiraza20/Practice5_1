package m_mehdi;

import java.util.Arrays;
import java.util.Objects;

/**
 * extended rectangle class from polygon
 */
public class Rectangle extends Polygon {
    public Rectangle(int int1,int int2,int int3,int int4){
        super(int1,int2,int3,int4);
    }

    /**
     * method to check whether it is square or not
     * @return
     */
    public boolean isSquare() {
        int counter = 0;
        for (Integer side : sides) {
            if (sides.get(0).equals(side)) {
                counter++;
            }
        }
        if (counter == 4) {
            return true;} else {
        return false; }

    }

    /**
     * method to calculate area
     * @return area
     */


    public double calculateArea() {
        double area = 1;
        for (Integer side : sides) {
            area *= side;
        }
        return Math.sqrt(area);
    }

     /**
     * method to cast to string
     * @return sides
     *
     * @return
     */
    @Override
    public String toString() {
        return "Rectangle: " + super.toString();
    }

}
