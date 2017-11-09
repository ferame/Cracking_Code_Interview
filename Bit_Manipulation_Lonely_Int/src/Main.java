import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(single(a));
    }

    private static int single(int[] list){
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++){
            if(i == list.length - 1){
                return list[i];
            }else if(list[i] == list[i+1]){
                i = i + 1;
            }else{
                return list[i];
            }
        }
        return 0;
    }
}