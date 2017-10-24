package ru.itis;

/**
 * 24.10.2017
 * ShapeInSpace
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ShapeInSpace {
    // ПОЛЯ
    private double x;
    private double y;
    protected double z;

    // КОНСТРУКТОР

    public ShapeInSpace(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // ГЕТТЕРЫ
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void move(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // не выполняется ничего
    public void scale(double value) {
        return;
    }
}
