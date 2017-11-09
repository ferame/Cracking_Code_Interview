import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    private static boolean checkIfEnough(HashMap<String,Integer> magazineMap, HashMap<String,Integer> ransomMap){
        for(Map.Entry m:ransomMap.entrySet()){
            String key = (String) m.getKey();
            int value = (int) m.getValue();
            if(magazineMap.containsKey(key)){
                if(magazineMap.get(key) < value){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        HashMap<String,Integer> magazineMap =new HashMap<String, Integer>();
        HashMap<String,Integer> ransomMap =new HashMap<String, Integer>();

        /* for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }  */
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String key = in.next();
            if(magazineMap.containsKey(key)){
                magazineMap.put(key,magazineMap.get(key)+1);
            }else{
                magazineMap.put(key, 1);
            }
        }
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String key = in.next();
            if(ransomMap.containsKey(key)){
                ransomMap.put(key,ransomMap.get(key)+1);
            }else{
                ransomMap.put(key, 1);
            }
        }
        System.out.println(checkIfEnough(magazineMap,ransomMap) ? "Yes" : "No");
    }
}
