import java.util.Scanner;

public class Game {
    private int battles = 0;
    private Character player1;
    private Character player2;
    private Character player3;

    private int scaling = 1;
    Scanner scan = new Scanner(System.in);

    private boolean fail = false;

    public Game(){
        System.out.println("WELCOME TO FANTASY PVE (any key to continue)");
        scan.nextLine();
        System.out.println(Utility.color("CONTROLS ARE ONLY 1,2,3... and Enter",Color.RED_BRIGHT) + Utility.color("    (So stopping spelling things out ughhh)",Color.WHITE));
        scan.nextLine();
        System.out.println("You will be given 3 random characters that you will have to bring to victory of 5 battles");
        scan.nextLine();
        start();


    }
    private void start(){
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



        for (double i = 1; battles < 5 ;i += .15){ //"gameplay" loop
            Battle battle =  new Battle(player1,player2,player3,genEnemy(i),genEnemy(i),genEnemy(i));
            if (battle.start()){
                battles++;
                System.out.println( "\n\n" + Utility.color(5 - battles + Utility.plural(" Battle",5 - battles), Color.WHITE_BOLD_BRIGHT) + " Away From Final Boss- Prepare Carefully! \n");
                System.out.println(Utility.color("CURRENT STATUS",Color.WHITE_BOLD_BRIGHT));
                System.out.println(player1.info() + "\n" + player2.info() + "\n" + player3.info() + "\n\n");
                Scenario.event(player1,player2,player3);
            } else {
                System.out.println(" \n\n You Lose, Bye Bye!");
                fail = true;
                System.out.println("Try Again? \n(1) Yes \n(2) No");
                if (Utility.tryInput(scan.nextLine(),2) == 1){
                    fail = false;
                    battles = 0;
                    start();
                } else {
                    System.out.println("See You Next Time!\n\n\n\n          On Dragon Ball Z");
                    battles = 5;
                    }
            }
        }
        if (!fail) {
            System.out.println("--Final Boss--");
            Battle battle = new Battle(player1, player2, player3, Entity.hydraHead(1), Entity.hydraHead(1), Entity.hydraHead(1));
            if(battle.start()){
                System.out.println(Utility.color("CONGRATS, You Beat The Hydra!",Color.YELLOW_BOLD_BRIGHT));
                System.out.print("Would You Like to keep going? \n(1) Yes \n(2) No");
                if (Utility.tryInput(scan.nextLine(),2) == 2){
                    System.out.println("Thanks For Playing!");
                } else {
                    InfiniteMode();
                }
            } else {
                System.out.println("L Bozo \nBuh Bye");
            }
        }

    }

    private void InfiniteMode(){
        System.out.println("You Will Be Enter Infinite Mode!\nGo As Far As You Can! (There is a Hydra every 10 fights BTW)");
        boolean lose = false;
        double infScale = 2;
        while (!lose){
            Battle inf =  new Battle(player1,player2,player3,genEnemy(infScale),genEnemy(infScale),genEnemy(infScale));
            if (inf.start()){
                battles++;
                infScale += .20;
                System.out.println( "\n\n" + Utility.color(battles + Utility.plural(" Battle",battles), Color.WHITE_BOLD_BRIGHT) + " Total, Keep it up!");
                System.out.println( Utility.color(battles + " Battles", Color.WHITE_BOLD_BRIGHT));
                System.out.println(Utility.color("\n\nCURRENT STATUS",Color.WHITE_BOLD_BRIGHT));
                System.out.println(player1.info() + "\n" + player2.info() + "\n" + player3.info() + "\n\n");
                Scenario.event(player1,player2,player3);
                if (battles % 5 == 0){
                    Battle hydra = new Battle(player1,player2,player3,Entity.hydraHead(infScale),Entity.hydraHead(infScale),Entity.hydraHead(infScale));
                }


            } else {
                System.out.println(" \n\n You Lose, Bye Bye! \nYou Survived: " + Utility.color(battles + Utility.plural(" Battle",battles), Color.WHITE_BOLD_BRIGHT));
                lose = true;
            }
        }
    }

    public Character genEnemy(double scaling){
        return Entity.allEnemies(scaling)[(int) (Math.random()*10)];
    }
    public Character genPlayer(){
        return Entity.startingChar(1)[(int) (Math.random()*4)];
    }

    private void scaleUp(double num){ scaling += num;}


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
