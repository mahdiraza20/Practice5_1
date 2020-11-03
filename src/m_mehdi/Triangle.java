package m_mehdi;

/**
 * triangle class extended from polygon
 */
public class Triangle extends Polygon {
    public  Triangle(int int1,int int2,int int3) {
        super(int1,int2,int3);
    }

    /**
     * method to check whether it is Equilateral or not
     * @return boolean
     */
    public boolean isEquilateral() {
        int counter = 0;
        for (Integer side : sides) {
            if (sides.get(0).equals(side)) {
                counter++;
            }
        }
        if (counter == 3) {

            return true;
        }else ;
        return false;
    }

    /**
     * method to calculate area
     * @return area
     */
    @Override
    public double calculateArea() {
        double area = 0;
        int j = sides.get(0) + sides.get(1) + sides.get(2);
        j /= 2;
        area = Math.sqrt(j * (j - sides.get(0)) * (j - sides.get(1)) * (j - sides.get(2)));
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
        return "Triangle: " + super.toString();
    }

}
