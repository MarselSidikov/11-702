package ru.itis;

/**
 * 24.10.2017
 * Box
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Box extends ShapeInSpace {
    private double height;
    private double width;
    private double length;

    public Box(double x, double y, double z, double height, double width, double length) {
        super(x, y, z);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void scale(double value) {
        this.length = this.length * value;
        this.height = this.height * value;
        this.width = this.width * value;
    }

}
