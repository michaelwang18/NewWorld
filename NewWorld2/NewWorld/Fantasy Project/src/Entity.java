public class Entity {
    //fuck you michael - past michael
    private Entity(){}


    public static Character goblin(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(100 * scaling); //Hp
        int attack = (int) Math.round(45 * scaling);
        int defense = (int) Math.round(15 * scaling);
        Character enemy = new Character("Goblin", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.twinslash());
        enemy.addSkills(SkillBook.slash());
        return enemy;
    }

    public static Character orge(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(350 * scaling); //Hp
        int attack = (int) Math.round(45 * scaling);
        int defense = (int) Math.round(5 * scaling);
        Character enemy = new Character("Orge", health, attack, defense);
        enemy.addSkills(SkillBook.bite());
        enemy.addSkills(SkillBook.clubBash());
        enemy.addSkills(SkillBook.clubBash());
        return enemy;
    }

    public static Character skeleton(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(120 * scaling); //Hp
        int attack = (int) Math.round(75 * scaling);
        int defense = (int) Math.round(5 * scaling);
        Character enemy = new Character("Skeleton", health, attack, defense);
        enemy.addSkills(SkillBook.tripleShot());
        enemy.addSkills(SkillBook.arrowShot());
        enemy.addSkills(SkillBook.arrowVolley());
        return enemy;
    }

    public static Character dragon(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(250 * scaling); //Hp
        int attack = (int) Math.round(35 * scaling);
        int defense = (int) Math.round(35 * scaling);
        Character enemy = new Character("Dragon", health, attack, defense);
        enemy.addSkills(SkillBook.scratch());
        enemy.addSkills(SkillBook.fireball());
        enemy.addSkills(SkillBook.fireBreath());
        return enemy;
    }

    public static Character hydraHead(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(350 * scaling); //Hp
        int attack = (int) Math.round(50 * scaling);
        int defense = (int) Math.round(15 * scaling);
        Character enemy = new Character("Hydra Head", health, attack, defense);
        enemy.addSkills(SkillBook.thunder());
        enemy.addSkills(SkillBook.fireball());
        enemy.addSkills(SkillBook.fireBreath());
        return enemy;
    }
    public static Character[] allEnemies(double scale){
        Character[] list = {goblin(scale),goblin(scale),goblin(scale),goblin(scale),skeleton(scale),skeleton(scale),skeleton(scale),orge(scale),orge(scale),dragon(scale)};
        return list;
    }


//GOOD PEOPLE PROLLY JUST HERE TO SEPERATE LINE CUZ YOU MESSY
    public static Character swordsman(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(125 * scaling); //Hp
        int attack = (int) Math.round(35 * scaling);
        int defense = (int) Math.round(25 * scaling);
        Character ally = new Character("Swordsman", health, attack, defense);
        ally.addSkills(SkillBook.twinslash());
        ally.addSkills(SkillBook.airSlash());
        ally.addSkills(SkillBook.slash());
        ally.addEvolutions(knight(1),duelist(1));
        return ally;
    }

    public static Character archer(double scaling) { // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(100 * scaling); //Hp
        int attack = (int) Math.round(55 * scaling);
        int defense = (int) Math.round(10 * scaling);
        Character ally = new Character("Archer", health, attack, defense);
        ally.addSkills(SkillBook.tripleShot());
        ally.addSkills(SkillBook.arrowShot());
        ally.addSkills(SkillBook.arrowVolley());
        return ally;
    }

    public static Character barbarian(double scaling) { // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(200 * scaling); //Hp
        int attack = (int) Math.round(55 * scaling);
        int defense = (int) Math.round(5 * scaling);
        Character ally = new Character("Barbarian", health, attack, defense);
        ally.addSkills(SkillBook.twinslash());
        ally.addSkills(SkillBook.clubBash());
        ally.addSkills(SkillBook.rockThrow());
        return ally;
    }

    public static Character wizard(double scaling) { // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(80 * scaling); //Hp
        int attack = (int) Math.round(75 * scaling);
        int defense = (int) Math.round(5 * scaling);
        Character ally = new Character("Wizard", health, attack, defense);
        ally.addSkills(SkillBook.fireball());
        ally.addSkills(SkillBook.fireBreath());
        ally.addSkills(SkillBook.thunder());
        return ally;
    }

    public static Character tester(double scaling) { // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(999 * scaling); //Hp
        int attack = (int) Math.round(999 * scaling);
        int defense = (int) Math.round(999 * scaling);
        Character ally = new Character("Deus Ex Machina", health, attack, defense);
        ally.addSkills(SkillBook.obliterate());
        ally.addSkills(SkillBook.obliterate());
        ally.addSkills(SkillBook.obliterate());
        return ally;
    }

    public static Character[] startingChar(double scaling){
        Character[] list = {swordsman(scaling),archer(scaling),barbarian(scaling),wizard(scaling)};
        return list;
    }

    //SWORDSMAN EVOLUTIONS

    public static Character knight(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(175 * scaling); //Hp
        int attack = (int) Math.round(55 * scaling);
        int defense = (int) Math.round(55 * scaling);
        Character ally = new Character("A Knight", health, attack, defense);
        ally.addSkills(SkillBook.shieldBash()); //Shield Bash
        ally.addSkills(SkillBook.swordThrust());
        ally.addSkills(SkillBook.swordSweep());
        return ally;
    }

    public static Character duelist(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(180 * scaling); //Hp
        int attack = (int) Math.round(85 * scaling);
        int defense = (int) Math.round(15 * scaling);
        Character ally = new Character("Duelist", health, attack, defense);
        ally.addSkills(SkillBook.twinslash()); //Shield Bash
        ally.addSkills(SkillBook.swordThrust());
        ally.addSkills(SkillBook.swordSweep());
        return ally;
    }

    //WIZARD EVOLUTIONS

    public static Character druid(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(175 * scaling); //Hp
        int attack = (int) Math.round(55 * scaling);
        int defense = (int) Math.round(55 * scaling);
        Character ally = new Character("A Knight", health, attack, defense);
        ally.addSkills(SkillBook.shieldBash()); //Shield Bash
        ally.addSkills(SkillBook.swordThrust());
        ally.addSkills(SkillBook.swordSweep());
        return ally;
    }

    public static Character elementalist(double scaling){ // 1.1 would be 10% scaling, 2.7 would be 170% scaling
        int health = (int) Math.round(180 * scaling); //Hp
        int attack = (int) Math.round(85 * scaling);
        int defense = (int) Math.round(15 * scaling);
        Character ally = new Character("Duelist", health, attack, defense);
        ally.addSkills(SkillBook.twinslash()); //Shield Bash
        ally.addSkills(SkillBook.swordThrust());
        ally.addSkills(SkillBook.swordSweep());
        return ally;
    }










    }
