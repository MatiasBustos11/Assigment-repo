import java.util.ArrayList;

public class MergeSortSimple {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(); //We create an empty list
        words = mergeSort(words); //We organise the list by using merge sort

      // Print the sorted list
        System.out.println("Sorted List:");
        System.out.println(words);
    }
     // This  will perform merge sort on the list
    public static ArrayList<String> mergeSort(ArrayList<String> list) {
        if (list.size() <= 1) { //If the list has 0 or 1 items, the list is sorted
            return list;
        }

        int middle = list.size() / 2;  //We first find the middle point of the list

        // Having the middle point, then, we separate the list into two halves
        ArrayList<String> left = new ArrayList<>(list.subList(0, middle));
        ArrayList<String> right = new ArrayList<>(list.subList(middle, list.size()));

        // We organise each half
        left = mergeSort(left);
        right = mergeSort(right);

        // Finally we merge both halves together
        return merge(left, right);
    }
    // // Here we will put together the two sorted lists into one sorted list
    public static ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
        ArrayList<String> result = new ArrayList<>();

        int i = 0; // Index for left list
        int j = 0; // Index for right list

        // Now we compare items from left and right and add the smaller one
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                result.add(left.get(i)); // left element is smaller
                i++; // move to the next element in left
            } else {
                result.add(right.get(j)); // right element is smaller
                j++; // move to the next element in right
            }
        }
        
        // Add the remaining elements from left list if any left
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        // Add the remaining elements from right list if any left
        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result; // Return the merged sorted list
    }
}
