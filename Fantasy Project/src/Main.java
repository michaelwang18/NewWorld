import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Char empty = new Char();
        Char knight = new Char("Sir Timmy", 1000, 250, 150);
        Char goblin1 = new Char("Green Goblin", 700, 150, 100);
        Char goblin2 = new Char("Green Gobby", 700, 150, 100);
        Char goblin3 = new Char("Green Goobs", 700, 150, 100);


        knight.addSkills(SkillBook.fireball());
        knight.addSkills(SkillBook.slash());
        knight.addSkills(SkillBook.smite());

        Battle forest = new Battle(knight, empty, empty, goblin1, goblin2, goblin3);

        //System.out.println(knight.turn());





    }
}