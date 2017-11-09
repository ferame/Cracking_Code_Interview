import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String helau = "aaabbbcccaaa";
        System.out.println(helau);
        System.out.println(countEncoding(helau));

        String[][] scoresList = new String[8][2];
        scoresList = defineScores(scoresList);
        System.out.println(bestAvg(scoresList));

        int[] pairs = {5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4,14};

        int constant = 15;
    }

    /*private static int[] getPairs(int[] pairs){
        int[] foundPairs = new int[];
        for(int i = 0; i < pairs.length; i++){

        }
        return foundPairs[];
    }*/

    private static String countEncoding(String helau) {
        StringBuilder decoded = new StringBuilder();
        int count = 0;
        for (int i = 0; i < helau.length(); i++){
            char letter = helau.charAt(i);
            count++;
            if (i == helau.length() - 1 || letter != helau.charAt(i+1)){
                decoded.append(letter).append(" ");
                decoded.append(Integer.toString(count)).append(" ");
                count = 0;
            }
        }
        return decoded.toString();
    }



    static int bestAverageGrade(String[][] scores) {
        if(scores.length == 0){
            return 0;
        }
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (String[] entry : scores) {
            String key = entry[0];
            if (map.containsKey(key)) {
                ArrayList<Integer> vals = map.get(key);
                vals.add(Integer.parseInt(entry[1]));
                map.put(key, vals);
            } else {
                ArrayList<Integer> vals = new ArrayList<>();
                vals.add(Integer.parseInt(entry[1]));
                map.put(key, vals);
            }
        }

        int bestAvg = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            ArrayList<Integer> vals = map.get(key);
            double avg = 0;
            for (int val : vals) {
                avg += val;
            }
            avg = avg/vals.size();
            if (avg > bestAvg){
                bestAvg = (int)Math.floor(avg);
            }
        }
        return bestAvg;
    }


    
    




    /*private static String bestAvg(String[][] scoresListas){
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        String result = "";
        for (String[] entry : scoresListas) {
            String key = entry[0];
            if (map.containsKey(key)) {
                ArrayList<Integer> vals = map.get(key);
                vals.add(Integer.parseInt(entry[1]));
                map.put(key, vals);
            } else {
                ArrayList<Integer> vals = new ArrayList<>();
                System.out.println(entry[0]);
                vals.add(Integer.parseInt(entry[1]));
                map.put(key, vals);
            }
        }

        // Get a set of the entries
        Set<Map.Entry<String, ArrayList<Integer>>> set = map.entrySet();

        // Get best
        int j = 0;
        String bestPerson = null;
        Double bestAvg = null;

        // Display elements
        for (Map.Entry<String, ArrayList<Integer>> me : set) {
            System.out.print(me.getKey() + ": ");
            ArrayList<Integer> vals = me.getValue();
            double avg = 0;
            for (int val : vals) {
                avg += val;
            }
            avg = avg/vals.size();
            System.out.print(me.getValue());
            System.out.println(", avg: " + avg);
            if (j == 0){
                bestPerson = me.getKey();
                bestAvg = avg;
            }
            if (avg > bestAvg){
                bestPerson = me.getKey();
                bestAvg = avg;
            }
            j++;
        }
        System.out.println(bestPerson + " " + bestAvg);

        return result;
    }*/

    private static String[][] defineScores(String[][] scoresListas){
        scoresListas[0][0] = "John";
        scoresListas[0][1] = "130";

        scoresListas[1][0] = "Ke$ha";
        scoresListas[1][1] = "-1";

        scoresListas[2][0] = "Peterlicious";
        scoresListas[2][1] = "32";

        scoresListas[3][0] = "Jack";
        scoresListas[3][1] = "120";

        scoresListas[4][0] = "Ke$ha";
        scoresListas[4][1] = "-3";

        scoresListas[5][0] = "John";
        scoresListas[5][1] = "-110";

        scoresListas[6][0] = "Peterlicious ";
        scoresListas[6][1] = "500";

        scoresListas[7][0] = "John";
        scoresListas[7][1] = "30";
        return scoresListas;
    }
}




// Given array of ints and constant find which two nums sum up to a const

//Done
// Given 2 dimensional string array, find the best average
// Jonas 20
// Petras 30

//Done
// String encoding, input is a string, hello
// output h 1 e 1 l 2 o 1