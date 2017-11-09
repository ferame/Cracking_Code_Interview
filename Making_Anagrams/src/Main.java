import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main {
    public static int numberNeeded(String first, String second) {
        int needed = 0;
        if (first.length() != second.length()){
            needed = Math.abs(first.length() - second.length());
            if(first.length() > second.length()){
                String temp = second;
                second = first;
                first = temp;
            }
        }
        for (char charF : first.toCharArray()){
            if (second.contains(Character.toString(charF))){
                second = deleteChar(charF, second);
            }else{
                needed += 2;
            }
        }
        return needed;
    }

    public static String deleteChar(char character, String word){
        int index = word.indexOf(character);
        StringBuilder wordSB = new StringBuilder(word);
        wordSB.deleteCharAt(index);
        word = wordSB.toString();
        return word;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}