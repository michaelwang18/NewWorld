import java.util.Scanner;
public class Scenario {

    private static Scanner scan = new Scanner(System.in);

    private Scenario(){}

    public static void event(Character p1, Character p2, Character p3){
        System.out.println("After Your Battle You Decide To...\n");
        int options = 3;
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
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Visit The Temple" ,25)  + Color.CYAN_BOLD + "+40 Max HP\uD83D\uDC9A  +80 HP\uD83D\uDC9A" + Color.RESET);
        }
        if (choice1 == 3 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Train" ,24)  + Color.CYAN_BOLD + " +20 Max HP\uD83D\uDC9A  +20 HP\uD83D\uDC9A  +10 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }
        if (choice1 == 4 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Review Strategy" ,25)  + Color.CYAN_BOLD + "+10 Max HP\uD83D\uDC9A  +5 ATK⚔\uFE0F  +5 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }

        System.out.print("\n(2) ");

        if (choice2 == 1 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Visit The Blacksmith" ,25) + Color.CYAN_BOLD + "+20 ATK⚔\uFE0F   +5 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }
        if (choice2 == 2 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT +  Utility.spaceout("Visit The Temple" ,25)  + Color.CYAN_BOLD + "+40 Max HP\uD83D\uDC9A  +80 HP\uD83D\uDC9A" + Color.RESET);
        }
        if (choice2 == 3 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Train" ,24)  + Color.CYAN_BOLD + " +20 Max HP\uD83D\uDC9A  +20 HP\uD83D\uDC9A  +10 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }
        if (choice2 == 4 ){
            System.out.println(Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Review Strategy" ,25)  + Color.CYAN_BOLD + "+10 Max HP\uD83D\uDC9A  +5 ATK⚔\uFE0F  +5 DEF\uD83D\uDEE1\uFE0F" + Color.RESET);
        }


        //DOING IT FUNNY

        System.out.print("\n(3) ");
        System.out.println( Color.WHITE_BOLD_BRIGHT + Utility.spaceout("Review Strategy" ,25)  + Color.GREEN_BOLD_BRIGHT + "     -- FULL HEAL --" + Color.RESET);

        if (Utility.chance(1,2)){ //sacrifice
            System.out.println("\n(4)" + Utility.color(" BLOOD SACRIFICE",Color.RED_BOLD_BRIGHT));
            options++;
        }

        int pick = Utility.tryInput(scan.nextLine(),options);
        if  (pick == 3){
            p1.heal();
            p2.heal();
            p3.heal();
            pick = 0;
        }

        if (pick == 4){
            p1.evolve(Entity.tester(1));
            p2.evolve(new Character());
            p3.evolve(new Character());
            pick = 0;
        }

        if (pick == 1){   //Generic Choices
            pick = choice1;
        }
        if (pick == 2){
            pick = choice2;
        }

        if (pick == 1){
            p1.statChange(0,20,0,0);
            p2.statChange(0,20,0,0);
            p3.statChange(0,20,0,0);
        }

        if (pick == 2){
            p1.statChange(80,0,0,40);
            p2.statChange(80,0,0,40);
            p3.statChange(80,0,0,40);
        }

        if (pick == 3){
            p1.statChange(20,0,15,20);
            p2.statChange(20,0,15,20);
            p3.statChange(20,0,15,20);
        }
        if (pick == 4){
            p1.statChange(0,10,5,20);
            p2.statChange(0,10,5,20);
            p3.statChange(0,10,5,20);
        }
    }


    public static void upgrade(Character player){
        System.out.println(Utility.color(player.getName(),Color.CYAN_BOLD_BRIGHT) + " Can Promote Into...  \n");
        for (int i = 0; i < player.getEvolutions().size() -1; i++){
            Character newCharacter = player.getEvolutions().get(i);
            System.out.println("(" + (i + 1) + ") " + Utility.color(newCharacter.getName(),Color.CYAN_BOLD_BRIGHT) + "\nHis trumpets sound... The Judgement Day hath come.\n");

        }
            int choice = Utility.tryInput(scan.nextLine(),player.getEvolutions().size()) - 1;
            player.evolve(player.getEvolutions().get(choice));

    }


}
