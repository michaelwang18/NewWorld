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
        System.out.println("WELCOME TO FANTASY PVE (any key to continue)");
        scan.nextLine();
        System.out.println("You will be given 3 random characters that you will have to bring to victory of 5 battles");
        scan.nextLine();
        System.out.println("Your starting team is: ");
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
        System.out.println("Press Enter To Start Your First Battle!\n");
        scan.nextLine();



        for (double i = 1; i <= 1.8; i = i + .2){ //"gameplay" loop
            Battle battle =  new Battle(player1,player2,player3,genEnemy(i),genEnemy(i),genEnemy(i));
            if (battle.start()){
                battles++;
                System.out.println( "\n\n" + Utility.color(5 - battles + " Battles", Color.WHITE_BOLD_BRIGHT) + " Away From Final Boss- Prepare Carefully! \n");
                System.out.println(Utility.color("CURRENT STATUS",Color.WHITE_BOLD_BRIGHT));
                System.out.println(player1.info() + "\n" + player2.info() + "\n" + player3.info() + "\n\n");
                Scenario.event(player1,player2,player3);


            } else {
                System.out.println(" \n\n You Lose, Bye Bye!");
                fail = true;
            }
        }
        if (!fail) {
            System.out.println("--Final Boss--");
            Battle battle = new Battle(player1, player2, player3, Entity.hydraHead(1.2), Entity.hydraHead(1.2), Entity.hydraHead(1.2));
            if(battle.start()){
                System.out.println(Utility.color("CONGRATS, You Beat The Hydra!",Color.YELLOW_BOLD_BRIGHT));
            } else {
                System.out.println("L Bozo \nBuh Bye");
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
        System.out.println();
        System.out.println(player1.info());
        player1.printSkillInfo();
        scan.nextLine();
        System.out.println();
        System.out.println(player2.info()); // GENERATES PLAYER TEAM
        player2.printSkillInfo();
        scan.nextLine();
        System.out.println();
        System.out.println(player3.info());
        player3.printSkillInfo();
        System.out.println("\n");
    }








}
