import java.util.ArrayList;
import java.util.Scanner;

public class Character {


    private String name;
    private String description;
    private ArrayList<String[]> allSkills = new ArrayList<String[]>();
    private Scanner scan = new Scanner(System.in);
    private int maxHealth;
    private int maxHPUp = 0;
    private int health;
    private int attack;
    private int atkUp = 0;
    private int defense;
    private int defUp = 0;
    boolean alive = true;
    private ArrayList<Character> evolutions = new ArrayList<Character>();




    public Character(String name, int health, int attack, int defense){
        this.name = name;
        this.attack = attack;
        maxHealth = health;
        this.defense = defense;
        this.health = maxHealth;
    }

    public void addEvolutions(Character evo1, Character evo2){
        evolutions.add(evo1);
        evolutions.add(evo2);
    }

    public Character(){
        name = "empty";
        alive = false;
    }

    public void statChange(int hp, int atk, int def, int maxHP){
        this.health += hp;
        this.attack += atk;
        atkUp += atk;
        this.defense += def;
        defUp += def;
        this.maxHealth += maxHP;
        maxHPUp += maxHP;
        if (!alive){
            health = 0;
        }
    }

    public void heal(){
        health = maxHealth;
        alive = true;
    }

    public void takeDMG(int dmg){
        int damageTaken = dmg - defense;
        boolean dodge = false;
        String dmgColor = Color.WHITE_BOLD_BRIGHT;
        if (Utility.chance(1,13)){ //Crit
            damageTaken = dmg * 2;
            dmgColor = Color.YELLOW_BOLD_BRIGHT;
            System.out.print(Utility.color("CRITICAL HIT! ",dmgColor));
        } else if (Utility.chance(1,20)){
            damageTaken = 0;
            System.out.print(Utility.color("DODGED! ",dmgColor));
            dodge = true;
        }
        if (damageTaken < 0 && !dodge){
            damageTaken = 1;
        }
        health = health - damageTaken;
        System.out.print (Utility.color(name,Color.CYAN_BOLD_BRIGHT) + " takes " + Utility.color(damageTaken + " Damage! ",dmgColor));
        System.out.println( "and has " + health + "/" + maxHealth + " health left");
        if (health <= 0){
            health = 0;
            alive = false;
            if (!name.equals("Hydra Head")) {
                System.out.println(name + " fainted!\n");
            }
        }
    }

    public void evolve(Character newCharacter){
        this.name = newCharacter.name;
       this.maxHealth = newCharacter.maxHealth + maxHPUp;
       health = maxHealth;
       alive = true;
       this.attack = newCharacter.attack + atkUp;
       this.defense = newCharacter.defense + defUp;
       this.allSkills = newCharacter.allSkills;
    }

    public void addSkills(String[] skill){
        allSkills.add(skill);
        //System.out.println(name + " Learnt The Skill: " + skill[0] + "!");
    }
    public int getHP(){return health;}
    public int getMaxHealth(){return maxHealth;}
    public int getATK(){return attack;}
    public int getDEF(){return defense;}
    public String getName(){return name;}

    public String[] getSkill(int num){
        return allSkills.get(num);
    }

    public ArrayList<Character> getEvolutions() {
        return evolutions;
    }

    public ArrayList<String[]> getAllSkills() {
        return allSkills;
    }

    public String turn(){
        if (!(name.equals("empty"))&& alive){
            System.out.println( Utility.color("\n" + name + "'s Turn! \n",Color.WHITE_BOLD_BRIGHT));
            printSkillInfo();
            System.out.println("Which Skill Will You Like To Use");


            int selection = Utility.tryInput(scan.nextLine(),allSkills.size()) - 1;
            String[] choseSkill = allSkills.get(selection);
            String target = choseSkill[2] + "";
            if (target.equals("Single Target")){
                System.out.println("Choose a target");
                return "S"+Utility.tryInput(scan.nextLine(),3)+choseSkill[3]+choseSkill[1];
            } else { //MASS attack
                return "M"+"m"+choseSkill[3]+choseSkill[1];
            }

        } else {System.out.println("Unable to Act, try again toodaloo loser something went wrong wooooo");}
        return " ";
    }

    public String info() {
        if (name.equals("Hydra Head") || alive && !(name.equals("empty"))) {
            String hp =  health + "/" + maxHealth + "\uD83D\uDC9AHP  ";
            String atk = attack + "⚔\uFE0FATK  ";
            String def = defense + "\uD83D\uDEE1\uFE0FDEF  ";
            String status = Color.CYAN_BOLD_BRIGHT + Utility.spaceout(name, 14) + Color.CYAN_BOLD + " " + Utility.spaceout(hp, 13) + Utility.spaceout(atk,7) + Utility.spaceout(def,10);

            return status + Color.RESET;
        } else if (!(name.equals("empty"))){
            String hp =  health + "/" + maxHealth + "\uD83D\uDC9AHP  ";
            String atk = attack + "⚔\uFE0FATK  ";
            String def = defense + "\uD83D\uDEE1\uFE0FDEF  ";
            String status = Utility.spaceout(name, 14) + " " + Utility.spaceout(hp, 13) + Utility.spaceout(atk,7) + Utility.spaceout(def,10);

            return Color.RED_BRIGHT + status + Color.RESET;
            }
            return "";
        }

    public void printSkillInfo(){
        for (int i = 0; i < allSkills.size(); i++){
            String[] skill = allSkills.get(i);
            System.out.println("-----------------Skill " + (i + 1) + "-------------------------" + Color.BLUE_BOLD_BRIGHT);
            System.out.print(Utility.spaceout(skill[0], 20) + Color.RESET);
            int dmg = (int) Math.round(Double.parseDouble(skill[1]) * attack);
            System.out.print(Utility.color(Utility.spaceout(dmg + " DMG ",8),Color.BLUE));
            System.out.print(Utility.color(Utility.spaceout(skill[3] + " Hit ",8),Color.BLUE));
                System.out.println( Utility.color(skill[2],Color.BLUE));


        }
        System.out.println("-------------------------------------------------");
    }

}
