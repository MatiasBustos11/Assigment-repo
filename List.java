import java.util.ArrayList;

public class MergeSortSimple {

    public static void main(String[] args) {
        // Step 1: Create an empty list of words
        ArrayList<String> words = new ArrayList<>();
        // Step 3: Sort the list using merge sort
        words = mergeSort(words);

      // Step 4: Print the sorted list
        System.out.println("Sorted List:");
        System.out.println(words);
    }