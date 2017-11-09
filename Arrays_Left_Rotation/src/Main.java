import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        k = k % n;
        //System.out.println("New rotations amount: " + Integer.toString(k));
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        a = rotate(n, k, a);

        printArray(a);
    }

    private static int[] rotate(int amount, int rots, int[] numbers){
        int[] tempArr = new int[amount];
        for(int i = 0; i < rots; i++){
            int first = numbers[0];
            for(int j = 1; j < amount; j++){
                numbers[j-1] = numbers[j];
            }
            numbers[amount-1] = first;
        }
        return numbers;
    }

    private static void printArray(int[] intArr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArr.length; i++){
            if (i != intArr.length - 1){
                sb.append(intArr[i] + " ");
            } else {
                sb.append(intArr[i]);
            }
        }
        System.out.println(sb.toString());
    }

}