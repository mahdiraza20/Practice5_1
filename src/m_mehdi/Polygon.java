package m_mehdi;
/**
 * polygon class for polygon shapes
 */

import java.util.ArrayList;

public class Polygon extends Shape{
    ArrayList<Integer> sides;
    public Polygon(int... entries) {
        sides = new ArrayList<>();
        for (int entry: entries) {
            this.sides.add(entry);

        }
        /**
         * method to get sided of shape
         */
    }
    public ArrayList<Integer> getSides(){
        return sides;
    }

    /**
     * method to calculate perimeter
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for (Integer side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    /**
     * method to output as String
     * @return
     */
    @Override
    public String toString() {
        String space = "";
        int j = 1;
        for (Integer side : sides) {
            space += "side" + j + ":" + side;
            if (j != sides.size()) {
                space += ", ";
            }
            j++;
        }
        return space;
    }

}

