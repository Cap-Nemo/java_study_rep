package ru.testpack.sandbox;

/**
 * Created by Nemo on 22.05.2016.
 */
public class DistanceBetweenPoints {

    public static void main(String[] args) {

        Point a = new Point(0, 0);
        Point b = new Point(3, 4);

        System.out.println(distance(a, b));

        System.out.println(a.distance(a, b));
        System.out.println(b.distance(new Point(-1, -5), new Point(50, -5)));

    }

    public static double distance(Point a, Point b) {
        return Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y));
    }

}
