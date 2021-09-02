package algorithm;

import org.testng.Assert;

import java.util.Arrays;

public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {

        Sort sort = new Sort();
        int[] myUnsortedArray = {2,7,45,89,23,4,1,75,34,91,38,20,51,44,93,23,6,4,77,27,10,11,41,78,28};

        System.out.println("Unsorted Array : " + Arrays.toString(myUnsortedArray));

        System.out.println("Sorted Selection Array : "+Arrays.toString(sort.selectionSort(myUnsortedArray)));
        System.out.println("Sorted Insertion Array : "+Arrays.toString(sort.insertionSort(myUnsortedArray)));
        System.out.println("Sorted Bubble Array : "+Arrays.toString(sort.bubbleSort(myUnsortedArray)));
        System.out.println("Sorted Merge Array : "+Arrays.toString(sort.mergeSort(myUnsortedArray,0, myUnsortedArray.length-1)));






        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        // Create instance of Sort class


        // Pass the unsorted array to selectionSort() method from Sort class
        sort.selectionSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }





    }
}
