import javax.xml.stream.events.EndElement;
import java.util.Scanner;

public class Game {
    private int battles = 0;
    private Char player1;
    private Char player2;
    private Char player3;
    Scanner scan = new Scanner(System.in);

    private boolean fail = false;

    public Game(){
        System.out.println("WELCOME TO UNTITLED TURN BASED GAME (any key to continue)");
        scan.nextLine();
        System.out.println("You will be given 3 random characters that you will have to bring to victory of 5 battles");
        scan.nextLine();
        System.out.println("Your starting team is: ");
        //TBD
        player1 = genPlayer();
        player2 = genPlayer();
        player3 = genPlayer();
        while (player1.getName().equals(player2.getName())){
            player2 = genPlayer();
        }

        while (player3.getName().equals(player2.getName()) || player3.getName().equals(player1.getName()) ){
            player3 = genPlayer();
        }
        printInfo();
        System.out.println("Press Enter To Start Your First Battle!\n\n\n\n\n\n\n");
        scan.nextLine();



        for (double i = 1; i <= 1.4; i = i + .1){ //"gameplay" loop
            Battle battle =  new Battle(player1,player2,player3,genEnemy(i),genEnemy(i),genEnemy(i));
            if (battle.start()){
                battles++;
                player1.info();
                player2.info();
                player3.info();
                System.out.println(5 - battles + "Away From Final Boss- Prepare Carefully! \n");
                Scenario.event(player1,player2,player3);


            } else {
                System.out.println(" \n\n\n You Lose! ");
                fail = true;
            }
        }
        if (!fail) {
            System.out.println("Final Boss!!!");
            Battle battle = new Battle(player1, player2, player3, Entity.hydraHead(1), Entity.hydraHead(1), Entity.hydraHead(1));
            if(battle.start()){
                System.out.println("CONGRATS, You Beat The Hydra!");
            }
        }


    }

    public Char genEnemy(double scaling){
        return Entity.allEnemies(scaling)[(int) (Math.random()*10)];
    }
    public Char genPlayer(){
        return Entity.playerChar(1)[(int) (Math.random()*4)];
    }


    public void printInfo(){
        System.out.println(player1.info());
        player1.printSkillInfo();
        System.out.println();
        scan.nextLine();
        System.out.println();
        System.out.println(player2.info()); // GENERATES PLAYER TEAM
        player2.printSkillInfo();
        scan.nextLine();
        System.out.println();
        System.out.println(player3.info());
        player3.printSkillInfo();
        System.out.println("\n\n\n\n");
    }








}
