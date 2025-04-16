import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;  // Unit 5annotation for the test methods

public class SortedTester {

    // This method runs the test and gives in return: true if it passes or false if it fails
    public static boolean runTest() {
        try {
            testMergeSort(); // Try running the test
            return true;     // If no errors, test passed
        } catch (Throwable t) {
            return false;    // If any exception or assertion fails, test failed
        }
    }

    @Test  // JUnit annotation that marks this method as a test case
    public static void testMergeSort() {
        // This is the list of unorganised months
        List<String> input = Arrays.asList("April", "January", "March", "February");

        // Here we tell how the list would be organised
        List<String> expected = Arrays.asList("April", "February", "January", "March");

        // Call mergeSort method from Sorter class
        ArrayList<String> actual = Sorter.mergeSort(new ArrayList<>(input));

        // Compare expected and actual results
        // If they don't match, throw an AssertionError to fail the test
        if (!Arrays.equals(expected.toArray(), actual.toArray())) {
            throw new AssertionError("Sorted output did not match expected result.");
        }
    }
}

