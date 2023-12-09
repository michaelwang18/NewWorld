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

    public static String color(String input, String color){
        return (color + input + Color.RESET);
    }

}
