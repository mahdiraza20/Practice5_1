package m_mehdi;

import java.util.ArrayList;

/**
 * class to gat shapes as arraylist and add , draw and print
 */

public class Paint {
    ArrayList<Shape> shapes;
    public Paint() {
        shapes = new ArrayList<>();
    }

    /**
     * method to add shapes
     * @param shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * method to draw shapes
     */
    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("----------");
        }
    }

    /**
     * method to print as strings
     */
    public void printAll() {
        for (Shape shape: shapes) {
            shape.toString();
        }
    }

    /**
     * method to describeEqualSides
     */
    public void describeEqualSides() {
        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                if (((Triangle) shape).isEquilateral()) {
                    System.out.println(shape + " is equilateral!");
                }
            }
            if (shape instanceof Rectangle) {
                if (((Rectangle) shape).isSquare()) {
                    System.out.println(shape + " is square!");
                }
            }
        }
    }


}
