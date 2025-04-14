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
     // This method will perform merge sort on the list
    public static ArrayList<String> mergeSort(ArrayList<String> list) {
        // Base case: If the list has 0 or 1 item, it is already sorted
        if (list.size() <= 1) {
            return list;
        }

        // Step 1: Find the middle point
        int middle = list.size() / 2;

        // Step 2: Divide the list into two halves
        ArrayList<String> left = new ArrayList<>(list.subList(0, middle));
        ArrayList<String> right = new ArrayList<>(list.subList(middle, list.size()));

        // Step 3: Sort each half (recursively)
        left = mergeSort(left);
        right = mergeSort(right);

        // Step 4: Merge the two sorted halves
        return merge(left, right);
    }
    // This method will merge two sorted lists into one sorted list
    public static ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
        ArrayList<String> result = new ArrayList<>();

        int i = 0; // Index for left list
        int j = 0; // Index for right list

        // Compare elements from left and right lists and add the smaller one
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                result.add(left.get(i)); // left element is smaller
                i++; // move to the next element in left
            } else {
                result.add(right.get(j)); // right element is smaller
                j++; // move to the next element in right
            }
        }

