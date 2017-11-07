package ru.itis;

public class Main {

    public static void main(String[] args) {
        // ShapeInSpace shape = new ShapeInSpace(2,3,4);

        Box box = new Box(1, 2, 3, 4, 5, 6);
        Box box1 = new Box(1, 2, 3, 4, 5, 6);
        Box box2 = new Box(1, 2, 3, 4, 5, 6);
        Sphere sphere = new Sphere(1, 2, 3, 10);
        Sphere sphere2 = new Sphere(1, 2, 3, 10);
        Sphere sphere3 = new Sphere(1, 2, 3, 10);
        Sphere sphere4 = new Sphere(1, 2, 3, 10);

        Point point = new Point(1, 1, 1);

        Scalable scalables[] = {box, box1, box2, sphere, sphere2, sphere3, sphere4};

        for (Scalable scalable : scalables) {
            scalable.scale(10);
        }

        ShapeInSpace shapes[] = {box, box1, box2, sphere, sphere2, sphere3, sphere4, point};

        for (ShapeInSpace shape : shapes) {
            shape.move(2, 2, 2);
        }

        Volumetric volumetrics[] = {box, box1, box2, sphere, sphere2, sphere3, sphere4};

        for (Volumetric volumetric : volumetrics) {
            System.out.println(volumetric.getVolume());
        }
    }
}
