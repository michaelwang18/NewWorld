import java.util.ArrayList;
import java.util.Scanner;

public class Char {


    private String name;

    private ArrayList<String[]> allSkills = new ArrayList<String[]>();
    private Scanner scan = new Scanner(System.in);
    private int maxHealth;
    private int health;
    private int attack;
    private int defense;

    boolean alive = true;


    public Char(String name, int health, int attack, int defense){
        this.name = name;
        this.attack = attack;
        maxHealth = health;
        this.defense = defense;
        this.health = maxHealth;
    }

    public Char(){
        name = "empty";
        alive = false;
    }

    public void statChange(int hp, int atk, int def, int maxHP){
        this.health += hp;
        this.attack += atk;
        this.defense += def;
        this.maxHealth += maxHP;
    }

    public void heal(){
        health = maxHealth;
    }

    public void takeDMG(int dmg){
        int damageTaken = dmg - defense;
        boolean dodge = false;
        if (Utility.chance(1,10)){ //Crit
            damageTaken = dmg * 2;
            System.out.println("Critical Hit!");
        } else if (Utility.chance(1,20)){
            damageTaken = 0;
            System.out.print("Dodged! ");
            dodge = true;
        }
        if (damageTaken < 0 && !dodge){
            damageTaken = 1;
        }
        health = health - damageTaken;
        System.out.print (name + " takes " + damageTaken + " Damage! ");
        System.out.println( "and has " + health + "/" + maxHealth + " health left");
        if (health <= 0){
            health = 0;
            alive = false;
            System.out.println(name + " fainted!");
        }
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

    public String turn(){
        if (!(name.equals("empty"))&& alive){
            System.out.println(name + "'s Turn! \n");
            printSkillInfo();
            System.out.println("Which Skill Will You Like To Use");
            int selection = scan.nextInt() - 1;
            String[] choseSkill = allSkills.get(selection);
            String target = choseSkill[2] + "";
            if (target.equals("Single Target")){
                System.out.println("Choose a target");
                return "S"+scan.nextInt()+choseSkill[1];
            } else { //MASS attack
                return "M"+"m"+choseSkill[1];
            }

        } else {System.out.println("Unable to Act, try again toodaloo loser something went wrong wooooo");}
        return " ";
    }

    public String info() {
        if (name.equals("Hydra Head") || alive && !(name.equals("empty"))) {
            String hp =  health + "/" + maxHealth + "\uD83D\uDC9AHP  ";
            String atk = attack + "⚔\uFE0FATK  ";
            String def = defense + "\uD83D\uDEE1\uFE0FDEF  ";

            return Utility.spaceout(name, 14) + " " + Utility.spaceout(hp, 15) + Utility.spaceout(atk,7) + Utility.spaceout(def,10);
        } else {
            return "";
            }
        }

    public void printSkillInfo(){
        for (int i = 0; i < allSkills.size(); i++){
            String[] skill = allSkills.get(i);
            System.out.println("-----------------Skill " + (i + 1) + "---------------------");
            System.out.print(Utility.spaceout(skill[0], 17));
            int dmg = (int) Math.round(Double.parseDouble(skill[1]) * attack);
            System.out.print(dmg + " DMG ");
            System.out.println(skill[2]);
        }
        System.out.println("---------------------------------------------");
    }

}
