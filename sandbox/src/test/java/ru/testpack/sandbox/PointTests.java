package ru.testpack.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Nemo on 6/3/16.
 */
public class PointTests {

    @Test
    public void testDistanceInPositiveRange() {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);

        Assert.assertEquals(p1.distance(p1, p2), 5.0);

    }

    @Test
    public void testDistanceInNegativeRange() {

        Point p1 = new Point(-1, -1);
        Point p2 = new Point(-2, -1);

        Assert.assertEquals(p2.distance(p1, p2), 1.0);

    }

    @Test
    public void testDistanceInMixedRange() {

        Point p1 = new Point(1, -5);
        Point p2 = new Point(50, -5);

        Assert.assertEquals(p2.distance(p1, p2), 49.0);

    }

}
