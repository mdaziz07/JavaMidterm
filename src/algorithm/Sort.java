package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] mergeSort(int[] array, int l, int r) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        if (l < r) {
            int m = l + (r-l)/2;
            mergeSort(list, l, m);
            mergeSort(list, m+1, r);
            merge(list, l, m, r);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle-left+1;
        int n2 = right-middle;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0;i < n1; i++) {
            L[i] = array[left+i];
        }
        for(int i = 0;i < n2; i++) {
            R[i] = array[middle+1+i];
        }
        int i = 0, j = 0, k =left;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                array[k++] = L[i++];
            }
            else {
                array[k++] = R[j++];
            }
        }
        while(i < n1) {
            array[k++] = L[i++];
        }
        while(j < n2) {
            array[k++] = R[j++];
        }
    }

    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        return list;
    }

    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        return list;
    }

    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        return list;
    }
}
