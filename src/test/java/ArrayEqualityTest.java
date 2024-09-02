import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals(a1, a2, "Arrays should be equal");

        // Modified to make arrays unequal
        int[] a3 = { 2, 3, 5, 8 };
        assertThrows(AssertionError.class, () -> {
            assertArrayEquals(a1, a3, "Arrays should not be equal");
        });
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        assertArrayEquals(a11, a12, "Arrays should be equal");

        // Modified to include an unequal array
        int[][] a13 = { { 2, 3 }, { 5, 7 }, { 11, 14 } };
        assertThrows(AssertionError.class, () -> {
            assertArrayEquals(a11, a13, "Arrays should not be equal");
        });
    }

    @Test
    public void testDifferentTypeArrayEquality() {
        // Test with String arrays
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals(s1, s2, "String arrays should be equal");

        // Test with double arrays
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals(d1, d2, 0.001, "Double arrays should be equal within delta");

        // Test for inequality
        String[] s3 = { "apple", "banana", "date" };
        assertThrows(AssertionError.class, () -> {
            assertArrayEquals(s1, s3, "String arrays should not be equal");
        });
    }
}