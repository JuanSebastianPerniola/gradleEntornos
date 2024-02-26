/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradlecopado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    // Count elements
    @Test
    public void testCountElement() {
        int[] arrayInt = new int[] { 1, 2, 3, 4, 5, 6, 9, 7 };
        assertEquals(8, gestorArrays.ElementsCount(arrayInt));
    }

    // Test firstPosition
    @Test
    public void testFirstValue() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 9, 7 };
        assertEquals(1, gestorArrays.firstElement(array));
    }

    // Test for the lastetPostion
    @Test
    public void testLastValue() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 9, 7 };
        assertEquals(7, gestorArrays.lastElement(array));
    }

    // Test third positon without a third position
    @Test
    public void thirdPosEmpty() {
        int[] array = { 1, 2 };
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> gestorArrays.thirdPosition(array));
        assertEquals("The array is no longer than 3 numbers ", exception.getMessage());
    }

    // Test for sum Total
    @Test
    public void testSumNEG() {
        int[] array = { 1, -2, 3, -4, 5 };
        assertEquals(3, gestorArrays.sumaTotal(array));
    }

    // test media Arrays negative
    @Test
    public void TestMedia() {
        int[] array = { 1, 2, 3, 4, 5, 6, 9, 7 };
        assertEquals(4.625, gestorArrays.mediaTotal(array));
    }

    // rest for empty arrays
    @Test
    public void testMediaEmpty() {
        int[] array = {};
        assertEquals(Double.NaN, gestorArrays.mediaTotal(array));
    }
}
