public class Entity {
    //fuck you michael - past michael
    private Entity(){}


    public static Char goblin(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(80 * scaling); //Hp
        int attack = (int) Math.round(35 * scaling);
        int defense = (int) Math.round(15 * scaling);
        Char enemy = new Char("Goblin", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.rockThrow());
        enemy.addSkills(SkillBook.slash());
        return enemy;
    }

    public static Char orge( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(200 * scaling); //Hp
        int attack = (int) Math.round(25 * scaling);
        int defense = (int) Math.round(20 * scaling);
        Char enemy = new Char("Orge", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.clubBash());
        enemy.addSkills(SkillBook.rockThrow());
        return enemy;
    }

    public static Char skeleton( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(100 * scaling); //Hp
        int attack = (int) Math.round(55 * scaling);
        int defense = (int) Math.round(0 * scaling);
        Char enemy = new Char("Skeleton", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.arrowShot());
        enemy.addSkills(SkillBook.arrowVolley());
        return enemy;
    }

    public static Char dragon( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(250 * scaling); //Hp
        int attack = (int) Math.round(35 * scaling);
        int defense = (int) Math.round(25 * scaling);
        Char enemy = new Char("Dragon", health, attack, defense);
        enemy.addSkills(SkillBook.scratch());
        enemy.addSkills(SkillBook.fireball());
        enemy.addSkills(SkillBook.fireBreath());
        return enemy;
    }

    public static Char hydraHead( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(300 * scaling); //Hp
        int attack = (int) Math.round(75 * scaling);
        int defense = (int) Math.round(35 * scaling);
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
    public static Char knight( double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(125 * scaling); //Hp
        int attack = (int) Math.round(35 * scaling);
        int defense = (int) Math.round(30 * scaling);
        Char ally = new Char("A Knight", health, attack, defense);
        ally.addSkills(SkillBook.slash());
        ally.addSkills(SkillBook.airSlash());
        ally.addSkills(SkillBook.shieldBash());
        return ally;
    }

    public static Char archer( double scaling) { // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(100 * scaling); //Hp
        int attack = (int) Math.round(55 * scaling);
        int defense = (int) Math.round(15 * scaling);
        Char ally = new Char("An Archer", health, attack, defense);
        ally.addSkills(SkillBook.vicmoc());
        ally.addSkills(SkillBook.arrowShot());
        ally.addSkills(SkillBook.arrowVolley());
        return ally;
    }

    public static Char barbarian( double scaling) { // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(200 * scaling); //Hp
        int attack = (int) Math.round(45 * scaling);
        int defense = (int) Math.round(5 * scaling);
        Char ally = new Char("A Barbarian", health, attack, defense);
        ally.addSkills(SkillBook.vicmoc());
        ally.addSkills(SkillBook.clubBash());
        ally.addSkills(SkillBook.rockThrow());
        return ally;
    }

    public static Char wizard( double scaling) { // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(80 * scaling); //Hp
        int attack = (int) Math.round(50 * scaling);
        int defense = (int) Math.round(5 * scaling);
        Char ally = new Char("A Wizard", health, attack, defense);
        ally.addSkills(SkillBook.fireball());
        ally.addSkills(SkillBook.fireBreath());
        ally.addSkills(SkillBook.thunder());
        return ally;
    }

    public static Char tester( double scaling) { // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(999 * scaling); //Hp
        int attack = (int) Math.round(999 * scaling);
        int defense = (int) Math.round(999 * scaling);
        Char ally = new Char("Hype", health, attack, defense);
        ally.addSkills(SkillBook.fireball());
        ally.addSkills(SkillBook.fireBreath());
        ally.addSkills(SkillBook.thunder());
        return ally;
    }

    public static Char[] playerChar( double scaling){
        Char[] list = {knight(scaling),archer(scaling),barbarian(scaling),wizard(scaling),};

        return list;
    }


    }
