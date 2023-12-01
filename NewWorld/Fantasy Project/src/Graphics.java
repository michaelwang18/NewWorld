public class Graphics {

    private Graphics(){}

    public static String skillPoints(int num, int max){
        String result = "";
        for (int i = 1; i <= max; i++){
            if (i <= num){
                result = result + "✦";
            } else {
                result = result + "✧";
            }

        }

        return result + " " + num + "/" + max + " SKILL POINTS ";
    }

    public static String spaceout(String orignal, int length){
        String res = orignal;
        while (res.length() < length){
            res = res + " ";
        }
        return res;
    }


}
