package indevlabs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static indevlabs.Main.findMissingNumberInArray;

class MainTest {

    @Test
    public void testFindMissingNumberInArray_NormalCases() {
        int[] testArray1 = {5, 0, 1, 3, 2};
        assertEquals(4, findMissingNumberInArray(testArray1));

        int[] testArray2 = {7, 9, 10, 11, 12};
        assertEquals(8, findMissingNumberInArray(testArray2));

        int[] testArray3 = {-3, 2, -2, 0, 1};
        assertEquals(-1, findMissingNumberInArray(testArray3));
    }

    @Test
    public void testFindMissingNumberInArray_SingleElement() {
        int[] testArray1 = {0};
        assertEquals(1, findMissingNumberInArray(testArray1));

        int[] testArray2 = {-1};
        assertEquals(0, findMissingNumberInArray(testArray2));
    }

    @Test
    public void testFindMissingNumberInArray_ContiguousArray() {
        int[] testArray1 = {0, 1, 2, 3, 4};
        assertEquals(5, findMissingNumberInArray(testArray1));

        int[] testArray2 = {-3, -2, -1, 0, 1};
        assertEquals(2, findMissingNumberInArray(testArray2));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMissingNumberInArray_NullOrEmptyArray(int[] input) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> findMissingNumberInArray(input));
        assertEquals("Input array is null or empty", exception.getMessage());
    }
}