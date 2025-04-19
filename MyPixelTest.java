package org.cis1200;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Use this file to test your implementation of Pixel.
 * 
 * We will manually grade this file to give you feedback
 * about the completeness of your test cases.
 */

public class MyPixelTest {

    /*
     * Remember, UNIT tests should ideally have one point of failure. Below we
     * give you two examples of unit tests for the Pixel constructor, one that
     * takes in three ints as arguments and one that takes in an array. We use
     * the getRed(), getGreen(), and getBlue() methods to check that the values
     * were set correctly. These two tests do not comprehensively test all of
     * Pixel so you must add your own.
     * 
     * You might want to look into assertEquals, assertTrue, assertFalse, and
     * assertArrayEquals at the following:
     * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
     *
     * Note, if you want to add global variables so that you can reuse Pixels
     * in multiple tests, feel free to do so.
     */

    @Test
    public void testConstructInBounds() {
        Pixel p = new Pixel(40, 50, 60);
        assertEquals(40, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }

    @Test
    public void testConstructArrayLongerThan3() {
        int[] arr = { 10, 20, 30, 40 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(30, p.getBlue());
    }

    /* ADD YOUR OWN TESTS BELOW */

    /*TEST DISTANCE */
    @Test
    public void testDistDiffPixels() {
        Pixel p1 = new Pixel(100, 100, 100);
        Pixel p2 = new Pixel(105, 95, 110);
        assertEquals(20, p1.distance(p2), "Distance between p1 and p2 should be 20");
    }

    @Test
    public void testDistSamePixels() {
        Pixel p1 = new Pixel(60, 60, 60);
        Pixel p2 = new Pixel(60, 60, 60);
        assertEquals(0, p1.distance(p2), "Distance between identical pixels should be 0");
    }

    @Test public void testDistNullPixel() {
        Pixel p1 = new Pixel(90, 90, 90);
        assertEquals(-1, p1.distance(null), "Distance to null pixel is -1");
    }

    /*TEST TO STRING */

    @Test
    public void testToString() {
        Pixel p = new Pixel(255, 100, 150);
        assertEquals("(255, 100, 150)", p.toString(), "toString should return (255, 100, 150)");
    }
    /*TEST sameRGB */

    @Test
    public void testSameRGBIdentical() {
        Pixel p1 = new Pixel(255, 255, 255);
        Pixel p2 = new Pixel(255, 255, 255);
        assertTrue(p1.sameRGB(p2), "SAME RGB value");
    }

    @Test
    public void testSameRGBDiffernet() {
        Pixel p1 = new Pixel(255, 0, 0);
        Pixel p2 = new Pixel(0, 255, 0);
        assertFalse(p1.sameRGB(p2), "Do NOT have the same RGB values");
    }

    @Test
    public void testSameRGBNull() {
        Pixel p = new Pixel(255, 255, 255);
        assertFalse(p.sameRGB(null),"should return false");
    }

}
