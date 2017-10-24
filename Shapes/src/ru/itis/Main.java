package ru.itis;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(1, 2, 3, 4, 5, 6);
        Sphere sphere = new Sphere(1, 2, 3, 10);

        box.move(12, 13, 14);
        sphere.move(15, 15, 15);

        box.scale(0.5);
        sphere.scale(1.0);
    }
}
