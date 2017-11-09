import java.io.*;
import java.util.*;

public class Main {

    public static class bubbleObj{
        int [] bubbleArray = new int[0];
        int bubbleSwap = 0;

        public bubbleObj(int[] array, int swapNum){
            bubbleArray = array;
            bubbleSwap = swapNum;
        }

        public int[] getArray(){
            return bubbleArray;
        }

        public int getSwap(){
            return bubbleSwap;
        }
    }

    private static bubbleObj bubbleSort(int[] array){
        int elemCount = array.length;
        int totalSwaps = 0;
        for (int element : array) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < elemCount - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    swap(array, j, (j + 1));
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
            totalSwaps += numberOfSwaps;
        }
        bubbleObj result = new bubbleObj(array, totalSwaps);
        return result;
    }

    private static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numCount = Integer.parseInt(in.next());
        int[] elements = new int[numCount];
        for (int i = 0; i < numCount; i++) {
            elements[i] = Integer.parseInt(in.next());
        }

        int swapCount = 0;
        bubbleObj result = bubbleSort(elements);
        elements = result.getArray();
        swapCount = result.getSwap();
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + elements[0]);
        System.out.println("Last Element: " + elements[numCount-1]);
    }
}