import java.util.Scanner;

public class Utility {

    public static String spaceout(String orignal, int length){
        String res = orignal;
        while (res.length() < length){
            res = res + " ";
        }
        return res;
    }

    public static boolean chance(int numerator, int denominator){
        double randNum = Math.random();
        double rate = (double) numerator/denominator;
        if (randNum <= rate){
            return true;
        }
            return false;
    }

    public static int tryInput(String input, int max){ // Learnt From W3Schools https://www.w3schools.com/java/java_try_catch.asp
        int num = 0;
        Scanner scan = new Scanner(System.in);
        try {
             num = Integer.parseInt(input);
             if (num > max){
                 System.out.println( Color.RED + "Please Enter A Valid Input! " + Color.RESET);
                 num = tryInput(scan.nextLine(), max);
             }
        } catch (Exception e){
            System.out.println( Color.RED + "Please Enter A Valid Input! " + Color.RESET);
            num = tryInput(scan.nextLine(), max);
        }
        return num;
    }

    public static String plural(String input, int number){
        if (!(1 == Math.abs(number))){
            return input + "s";
        }
        return input;
    }

    public static String color(String input, String color){
        return (color + input + Color.RESET);
    }

    public static void Campfire(){
        System.out.print("            ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        System.out.print(Text.Reset_Background);
        System.out.print("            " + "\n");

        System.out.print("         ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("   ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        System.out.print(Text.Reset_Background);
        System.out.print("            "+ "\n");

        System.out.print("      ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("         ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        System.out.print(Text.Reset_Background);
        System.out.print("      ");
        Text.color((Text.background(Text.RED)));
        System.out.print("");
        System.out.print(Text.Reset_Background);
        System.out.println();

        System.out.print("   ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("      ");
        Text.color(Text.brighterColor(Text.background(Text.YELLOW)));
        System.out.print("      ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("");
        Text.color((Text.background(Text.RED)));
        System.out.print("      ");
        System.out.print(Text.Reset_Background);
        System.out.print("   ");
        System.out.println();

        System.out.print("   ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.YELLOW)));
        System.out.print("          ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("   ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        System.out.print(Text.Reset_Background);
        System.out.print("   ");
        System.out.println();

        System.out.print("   ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.YELLOW)));
        System.out.print("          ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("   ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        System.out.print(Text.Reset_Background);
        System.out.print("   ");
        System.out.println();

        System.out.print("   ");
        Text.color((Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.YELLOW)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("      ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        Text.color((Text.background(Text.BLACK)));
        System.out.print("   ");
        System.out.print(Text.Reset_Background);
        System.out.print("   ");
        System.out.println();

        Text.color((Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color((Text.background(Text.RED)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.RED)));
        System.out.print("      ");
        Text.color((Text.background(Text.RED)));
        System.out.print("      ");
        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color((Text.background(Text.BLACK)));
        System.out.print("   ");
        System.out.print(Text.Reset_Background);
        System.out.println();

        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("          ");
        Text.color((Text.background(Text.RED)));
        System.out.print("      ");
        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color((Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("         ");
        System.out.print(Text.Reset_Background);
        System.out.println();

        Text.color((Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("      ");
        Text.color((Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("         ");
        Text.color((Text.background(Text.BLACK)));
        System.out.print("   ");
        Text.color(Text.brighterColor(Text.background(Text.BLACK)));
        System.out.print("       ");
        System.out.print(Text.Reset_Background);
        System.out.println();
    }

    public static void iconText(){
        System.out.println( Color.RED_BOLD + "          _______  _        _______  _______  _______  _______   _________ _______                   \n" +
                "|\\     /|(  ____ \\( \\      (  ____ \\(  ___  )(       )(  ____ \\  \\__   __/(  ___  )                  \n" +
                "| )   ( || (    \\/| (      | (    \\/| (   ) || () () || (    \\/     ) (   | (   ) |                  \n" +
                "| | _ | || (__    | |      | |      | |   | || || || || (__         | |   | |   | |                  \n" + Color.RED_BOLD_BRIGHT +
                "| |( )| ||  __)   | |      | |      | |   | || |(_)| ||  __)        | |   | |   | |                  \n" +
                "| || || || (      | |      | |      | |   | || |   | || (           | |   | |   | |                  \n" +
                "| () () || (____/\\| (____/\\| (____/\\| (___) || )   ( || (____/\\     | |   | (___) |                  \n" +
                "(_______)(_______/(_______/(_______/(_______)|/     \\|(_______/     )_(   (_______)                  \n" +
                "                                                                                                     \n" + Color.YELLOW_BOLD +
                " _______  _______  _______  _______  _______ _________ _______  _______    _______   _______   _______ \n" +
                "(  ____ \\(  ___  )(       )(  ____ )(  ____ \\\\__   __/(  ____ )(  ____ \\  (  ____ ) (  ____ ) (  ____ \\\n" +
                "| (    \\/| (   ) || () () || (    )|| (    \\/   ) (   | (    )|| (    \\/  | (    )| | (    )| | (    \\/\n" +
                "| |      | (___) || || || || (____)|| (__       | |   | (____)|| (__      | (____)| | (____)| | |      \n" +
                "| |      |  ___  || |(_)| ||  _____)|  __)      | |   |     __)|  __)     |     __) |  _____) | | ____ \n" + Color.YELLOW_BOLD_BRIGHT +
                "| |      | (   ) || |   | || (      | (         | |   | (\\ (   | (        | (\\ (    | (       | | \\_  )\n" +
                "| (____/\\| )   ( || )   ( || )      | )      ___) (___| ) \\ \\__| (____/\\  | ) \\ \\__ | )       | (___) |\n" +
                "(_______/|/     \\||/     \\||/       |/       \\_______/|/   \\__/(_______/  |/   \\__/ |/        (_______)" + Color.RESET);
    }



}
