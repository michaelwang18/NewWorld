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

}
