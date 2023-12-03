public class Entity {
    //fuck you michael - past michael
    private Entity(){}


    public static Char goblin(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(100 * scaling); //Hp
        int attack = (int) Math.round(25 * scaling);
        int defense = (int) Math.round(10 * scaling);
        Char enemy = new Char("Goblin", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.rockThrow());
        enemy.addSkills(SkillBook.slash());
        return enemy;
    }

    public static Char orge( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(200 * scaling); //Hp
        int attack = (int) Math.round(15 * scaling);
        int defense = (int) Math.round(20 * scaling);
        Char enemy = new Char("Orge", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.clubBash());
        enemy.addSkills(SkillBook.rockThrow());
        return enemy;
    }

    public static Char skeleton( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(120 * scaling); //Hp
        int attack = (int) Math.round(45 * scaling);
        int defense = (int) Math.round(0 * scaling);
        Char enemy = new Char("Skeleton", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.arrowShot());
        enemy.addSkills(SkillBook.arrowVolley());
        return enemy;
    }

    public static Char dragon( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(250 * scaling); //Hp
        int attack = (int) Math.round(45 * scaling);
        int defense = (int) Math.round(20 * scaling);
        Char enemy = new Char("Dragon", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.arrowShot());
        enemy.addSkills(SkillBook.arrowVolley());
        return enemy;
    }

    public static Char hydraHead( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(250 * scaling); //Hp
        int attack = (int) Math.round(45 * scaling);
        int defense = (int) Math.round(0 * scaling);
        Char enemy = new Char("Hydra Head", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.arrowShot());
        enemy.addSkills(SkillBook.arrowVolley());
        return enemy;
    }
    public static Char[] allEnemies(double scale){
        Char[] list = {goblin(scale),goblin(scale),goblin(scale),goblin(scale),skeleton(scale),skeleton(scale),skeleton(scale),orge(scale),orge(scale),dragon(scale)};
        return list;
    }


//GOOD PEOPLE PROLLY JUST HERE TO SEPERATE LINE CUZ YOU MESSY



}