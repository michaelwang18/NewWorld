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
    ArrayList<Char> playerTeam = new ArrayList<>();
    ArrayList<Char> enemyTeam = new ArrayList<>();

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


    }
    public boolean start() { // true for win, false for lose
        int round = 1;
        while (enemy1.alive || enemy2.alive || enemy3.alive ) {

            System.out.println("--------------------ROUND " + round + "-------------------------");
            overview();
            System.out.println();
            useSkill(player1);
            overview();
            useSkill(player2);
            overview();
            useSkill(player3);
            if (!enemy1.alive && !enemy2.alive && !enemy3.alive ) {return true;}
            System.out.println("---------------ENEMY TURN--------------");
            enemySkill(enemy1);
            enemySkill(enemy2);
            enemySkill(enemy3);
            round++;
            System.out.println("\n-----------------------------------------\n\n");

        }
        if (player1.alive || player2.alive || player3.alive || !enemy1.alive & !enemy2.alive & !enemy3.alive) {
        return true;
        }
        return false;
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

    private void useSkill (Char player) {
        if (player.alive && enemy1.alive || enemy2.alive || enemy3.alive ) {
            String info = player.turn();
            int atk = player.getATK();
            int dmg = (int) Math.round(Double.parseDouble(info.substring(2)) * atk);
            if (info.substring(0, 1).equals("M")) {
                for (int i = 0; i < enemyTeam.size(); i++) {
                    Char target = enemyTeam.get(i);
                    if (target.alive){
                        target.takeDMG(dmg);
                    }
                }
            }
            if (info.substring(0, 1).equals("S")) {
                Char target = enemyTeam.get(Integer.parseInt(info.substring(1, 2))-1);
                target.takeDMG(dmg);
            }
            if (info.substring(0, 1).equals("R")) {
                int targetChoice = (int) (Math.random() * (enemyTeam.size()));
                Char target = enemyTeam.get(targetChoice);
                while(!target.alive){
                    targetChoice = (int) (Math.random() * (enemyTeam.size()));
                    target = enemyTeam.get(targetChoice);
                }
                target.takeDMG(dmg);
            }
        }
    }

    private void enemySkill (Char badGuy) { //im the bald guy
        int skillchoice = (int) (Math.random() * 3) ;
        String[] info = badGuy.getSkill(skillchoice); //Info is 0 = Name | 1 (Str) = damage mult (double) | 2 = targetting (Str)
        System.out.println("\n" + badGuy.getName() + " uses " + info[0] );
        int dmg = (int) Math.round(Double.parseDouble(info[1]) * badGuy.getATK());
        if (badGuy.alive || badGuy.getName().equals("Hydra Head")) { //Only allows them to act if they are alive or hydra head
            //System.out.println(badGuy.getName() + "Is unable to act!");
            if (info[2].equals("Mass Attack")) {
                for (int i = 0; i < playerTeam.size(); i++) {
                    Char target = playerTeam.get(i);
                    if (target.alive) {
                        target.takeDMG(dmg);
                    }
                }
            } else if (info[2].equals("Single Target")) {
                int targetChoice = (int) (Math.random() * (playerTeam.size()));
                Char target = playerTeam.get(targetChoice);
                while (!target.alive) {
                    targetChoice = (int) (Math.random() * (playerTeam.size()));
                    target = playerTeam.get(targetChoice);
                }
                target.takeDMG(dmg);
            }




        }
    }

}
