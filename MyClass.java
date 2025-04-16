public class MyClass {
    public static void main(String[] args) {
        boolean result = SortedTester.runTest(); // Run the test and store result

        // Show result depending if pass or fail
        if (result) {
            System.out.println("✅ Test passed: Sorter works correctly!");
        } else {
            System.out.println("❌ Test failed: Sorter did not return expected results.");
        }
    }
}