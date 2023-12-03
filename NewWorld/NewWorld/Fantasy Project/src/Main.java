public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Char empty = new Char();
        Char knight = new Char("Sir Timmy", 100, 50, 50);
        Char nomnom = new Char("Nom Nom", 75, 25, 50);


        System.out.println((int)(Math.random()*3) + 1);


        knight.addSkills(SkillBook.vicmoc());
        knight.addSkills(SkillBook.slash());
        knight.addSkills(SkillBook.smite());

        nomnom.addSkills(SkillBook.bite());
        nomnom.addSkills(SkillBook.bite());
        nomnom.addSkills(SkillBook.bite());

        Battle forest = new Battle(knight, nomnom, empty, Entity.goblin(1), Entity.skeleton( 1.5), Entity.orge(2));

        //System.out.println(knight.turn());





    }
}