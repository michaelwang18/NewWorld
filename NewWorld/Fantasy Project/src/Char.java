import java.util.ArrayList;
import java.util.Date;
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
    }

    public void statChange(int hp, int atk, int def){
        this.health += hp;
        this.attack += atk;
        this.defense += def;
    }

    public void takeDMG(int dmg){
        health = health - (dmg - defense);
        System.out.println (" For " + (dmg - defense) + " Damage!");
        System.out.println(name + " has " + health + " health left");
        if (health >= 0){
            health = 0;
            alive = false;
        }
    }



    public void addSkills(String[] skill){
        allSkills.add(skill);
        System.out.println(name + " Learnt The Skill: " + skill[1] + "!");
    }


    public int getHP(){return health;}
    public int getMaxHealth(){return maxHealth;}
    public int getATK(){return attack;}
    public int getDEF(){return defense;}
    public String getName(){return name;}



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
                return "M"+choseSkill[1];
            }

        } else {System.out.println("Unable to Act, try again toodaloo loser");}
        return " ";
    }

    public String info() {
        if (alive && !(name.equals("empty"))) {
            String hp =  health + "/" + maxHealth + "\uD83D\uDC9AHP  ";
            String atk = attack + "⚔\uFE0FATK  ";
            String def = defense + "\uD83D\uDEE1\uFE0FDEF  ";

            return Graphics.spaceout(name, 14) + " " + Graphics.spaceout(hp, 15) + Graphics.spaceout(atk,7) + Graphics.spaceout(def,10);
        }
            return "";
        }


    public void printSkillInfo(){
        for (int i = 0; i < allSkills.size(); i++){
            String[] skill = allSkills.get(i);
            System.out.println("-----------------Skill " + (i + 1) + "---------------------");
            System.out.print(Graphics.spaceout(skill[0], 10));
            int dmg = (int) Double.parseDouble(skill[1]) * attack;
            System.out.print(dmg + " DMG ");
            System.out.println(skill[2]);
        }
        System.out.println("---------------------------------------------");
    }



}
