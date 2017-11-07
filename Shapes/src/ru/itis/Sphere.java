package ru.itis;

/**
 * 24.10.2017
 * Sphere
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Sphere extends ShapeInSpace implements Scalable, Volumetric {
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void scale(double value) {
        this.radius = this.radius * value;
    }

    public double getVolume() {
        return (4/3.0) * Math.PI * (radius*radius*radius);
    }
}
