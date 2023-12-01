import javax.xml.stream.events.EndElement;
import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;

public class Battle {
    Char player1;
    Char player2;
    Char player3;
    Char enemy1;
    Char enemy2;
    Char enemy3;
    ArrayList<Char> playerTeam = new ArrayList<Char>();
    ArrayList<Char> enemyTeam = new ArrayList<Char>();

    int skillPoints = 3;

    public Battle(Char p1, Char p2, Char p3, Char e1, Char e2, Char e3){
        System.out.println("BATTLE START");
        player1 = p1;
        player2 = p2;
        player3 = p3;
        playerTeam.add(p1);
        playerTeam.add(p2);
        playerTeam.add(p3);
        enemy1 = e1;
        enemy2 = e2;
        enemy3 = e3;
        enemyTeam.add(e1);
        enemyTeam.add(e2);
        enemyTeam.add(e3);
        start();

    }
    public void start(){
        System.out.println("@");
        int round = 1;
        while (enemy1.alive || enemy2.alive || enemy3.alive){

            System.out.println("--------------------ROUND " + round + "-------------------------");
            overview();
            System.out.println("");
            player1.turn();
            player2.turn();
            player3.turn();

            round++;

        }
    }



    public void overview(){
        for (int i = 1; i <= playerTeam.size(); i++){
            Char temp = playerTeam.get(i-1);
            System.out.println("(" + i + ") " + temp.info());

        }
        System.out.println("------------------------------");
        for (int i = 1; i <= enemyTeam.size(); i++){
            Char temp = enemyTeam.get(i-1);
            System.out.println("(" + i + ") " + temp.info());

        }

    }

    private void useSkill (String info){


    }



}
