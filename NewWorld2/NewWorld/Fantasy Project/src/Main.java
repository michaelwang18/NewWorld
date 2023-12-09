


public class Main {
    public static void main(String[] args) {

        Character Bobby = Entity.swordsman(1);
        Scenario.upgrade(Bobby);

        System.out.println(Bobby.info());
        Bobby.printSkillInfo();


        Game game  = new Game();



        //System.out.println("Enter Int");
        //System.out.println(Utility.tryInput(scan.nextLine(),5));

    }
}

//https://www.w3schools.com/c/c_arrays.php#:~:text=Arrays%20are%20used%20to%20store,followed%20by%20square%20brackets%20%5B%5D.
//w3schools referenced for C arrays and arraylists