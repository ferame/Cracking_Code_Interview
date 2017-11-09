import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2){
        int p1score = p1.score;
        int p2score = p2.score;

        if (p1score > p2score) {
            return -1;
        } else if (p1score < p2score) {
            return 1;
        }

        String p1name = p1.name;
        String p2name = p2.name;
        int comparison = p1name.compareTo(p2name);
        return Integer.compare(comparison, 0);
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}