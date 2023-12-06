import java.util.ArrayList;
import java.util.Scanner;

public class Battle {
    Char player1;
    Char player2;
    Char player3;
    Char enemy1;
    Char enemy2;
    Char enemy3;
    ArrayList<Char> playerTeam = new ArrayList<>();
    ArrayList<Char> enemyTeam = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

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

            if (!enemy1.alive && !enemy2.alive && !enemy3.alive ) {return true;}
            System.out.println("--------------------" + Utility.color("ROUND " + round,Color.WHITE_BOLD_BRIGHT) + "-------------------------");
           /* if (player1.alive){
                System.out.println();
                overview();}
            useSkill(player1);
            if (player2.alive){
                System.out.println();
                overview();}
            useSkill(player2);
            if (player3.alive){
                System.out.println();
                overview();} */
            for (int i = 0; i < playerTeam.size(); i++){
                if (playerTeam.get(i).alive){
                    System.out.println();
                    overview();}
                    useSkill(playerTeam.get(i));
            }
            if (!enemy1.alive && !enemy2.alive && !enemy3.alive ) {return true;}
            System.out.println("---------------" + Utility.color("Enemy Turn",Color.WHITE_BOLD_BRIGHT)+"--------------");
            enemySkill(enemy1);
            enemySkill(enemy2);
            enemySkill(enemy3);

            round++;
            System.out.println("\n-----------------------------------------\n\n");
            if (!enemy1.alive & !enemy2.alive & !enemy3.alive && (player1.alive || player2.alive || player3.alive)) {
                return true;
            } else if (!(player1.alive || player2.alive || player3.alive)){
                return false;
            }
        }
         return true;
        }




    public void overview(){
        if (enemy1.alive || enemy2.alive || enemy3.alive ) {
            for (int i = 1; i <= playerTeam.size(); i++) {
                Char temp = playerTeam.get(i - 1);
                System.out.println("(" + i + ") " + temp.info());

            }
            System.out.println("-------------------------------------------------");
            for (int i = 1; i <= enemyTeam.size(); i++) {
                Char temp = enemyTeam.get(i - 1);
                System.out.println("(" + i + ") " + temp.info());

            }
        }
    }


    private void useSkill (Char player) {
        if (player.alive && enemy1.alive || player.alive && enemy2.alive || player.alive && enemy3.alive ) {
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
            if (info.substring(0, 1).equals("R")) {   //Attempt for random attack
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
        int dmg = (int) Math.round(Double.parseDouble(info[1]) * badGuy.getATK());
        if (badGuy.getName().equals("Hydra Head") || badGuy.alive) { //Only allows them to act if they are alive or hydra head

            if (player1.alive || player2.alive || player3.alive){System.out.println("\n" + Utility.color(badGuy.getName(), Color.CYAN_BOLD_BRIGHT) + " uses " + Utility.color(info[0],Color.BLUE_BRIGHT) );}
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
