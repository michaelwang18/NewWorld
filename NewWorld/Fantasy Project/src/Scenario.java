import java.util.Scanner;
public class Scenario {

    private Scenario(){}

    public static void event(Char p1, Char p2, Char p3){
        System.out.println("After Your Battle You Decide To...\n");
        Scanner scan = new Scanner(System.in);
        int choice1 = (int) (Math.random() * 4) + 1; //4 options
        int choice2 = (int) (Math.random() * 4) + 1;
        while (choice2 == choice1) {            //Confirm not the same number
            choice2 = (int) (Math.random() * 4) + 1;
        }

        System.out.print("(1) ");
        if (choice1 == 1 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Visit The Blacksmith" ,25)  + Color.CYAN_BOLD + "+20 ATK⚔\uFE0F   +5 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }
        if (choice1 == 2 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Visit The Temple" ,25)  + Color.CYAN_BOLD + "+20 Max HP\uD83D\uDC9A  +20 HP\uD83D\uDC9A" + Color.RESET);
        }
        if (choice1 == 3 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Train" ,25)  + Color.CYAN_BOLD + " +10 Max HP\uD83D\uDC9A  +10 HP\uD83D\uDC9A  +10 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }
        if (choice1 == 4 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Review Strategy" ,25)  + Color.CYAN_BOLD + "+10 Max HP\uD83D\uDC9A  +5 ATK⚔\uFE0F  +5 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }

        System.out.print("\n(2) ");

        if (choice2 == 1 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Visit The Blacksmith" ,25) + Color.CYAN_BOLD + "+20 ATK⚔\uFE0F   +5 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }
        if (choice2 == 2 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT +  Utility.spaceout("Visit The Temple" ,25)  + Color.CYAN_BOLD + "+20 Max HP\uD83D\uDC9A  +20 HP\uD83D\uDC9A" + Color.RESET);
        }
        if (choice2 == 3 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Train" ,25)  + Color.CYAN_BOLD + " +10 Max HP\uD83D\uDC9A  +10 HP\uD83D\uDC9A  +10 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }
        if (choice2 == 4 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Review Strategy" ,25)  + Color.CYAN_BOLD + "+10 Max HP\uD83D\uDC9A  +5 ATK⚔\uFE0F  +5 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }

        System.out.print("\n(3) ");
        System.out.println( Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Review Strategy" ,25)  + Color.GREEN_BOLD_BRIGHT + "     -- FULL HEAL --" + Color.RESET);


        int pick = scan.nextInt();
        if  (pick == 3){
            p1.heal();
            p2.heal();
            p3.heal();
        }
        if (pick == 1){
            pick = choice1;
        }
        if (pick == 2){
            pick = choice2;
        }

        if (pick == 1){
            p1.statChange(0,20,5,0);
            p2.statChange(0,25,5,0);
            p3.statChange(0,25,5,0);
        }

        if (pick == 2){
            p1.statChange(20,0,10,20);
            p2.statChange(20,0,10,20);
            p3.statChange(20,0,10,20);
        }

        if (pick == 3){
            p1.statChange(10,0,10,10);
            p2.statChange(10,0,10,10);
            p3.statChange(10,0,10,10);
        }
        if (pick == 4){
            p1.statChange(0,5,5,10);
            p2.statChange(0,5,5,10);
            p3.statChange(0,5,5,10);
        }

        System.out.println(p1.info() + "\n" + p2.info() + "\n" + p3.info());



    }








}
