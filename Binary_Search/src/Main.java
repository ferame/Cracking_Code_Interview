import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    private static void getOptions(int money, int[]flavsCost){
        int bestFirst = 0;
        int bestSecond = 0;
        int bestSum = 0;
        for(int i = 0; i < flavsCost.length -1 ; i++){
            for(int j = i+1; j < flavsCost.length; j++){
                int sum = flavsCost[i] + flavsCost[j];
                if(sum == money){
                    System.out.println((i+1) + " " + (j+1));
                    return;
                }else if((sum < money) && (sum > bestSum)){
                    bestSum = sum;
                    bestFirst = i;
                    bestSecond = j;
                }
            }
        }
        System.out.println((bestFirst+1) + " " + (bestSecond+1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trips = in.nextInt();
        int money = 0;
        int flavsNum = 0;
        for(int a0 = 0; a0 < trips; a0++){
            money = in.nextInt();
            flavsNum = in.nextInt();
            int[] flavsCost = new int[flavsNum];
            for(int a_i=0; a_i < flavsNum; a_i++){
                flavsCost[a_i] = in.nextInt();
            }
            getOptions(money, flavsCost);
        }
    }
}
