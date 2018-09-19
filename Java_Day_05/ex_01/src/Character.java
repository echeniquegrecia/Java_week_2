/**
 * <h1>Character!</h1>
 * The Character class contains all the features of a character and the things that they can do.
 * <p>
 *
 * @author  Grecia Echenique
 * @version 1.0
 * @since   2018-09-14
 */

public class Character {

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected Integer strength = 2;
    protected int wit = 2;
    protected static final String Class = "Character";
    protected Integer magnetism;


    /**
     * This method is used to add two create a Character.
     * @param name This is the name of the Character
     */

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    /**
     * This method is used to attack to somebody.
     * @param parameter Represent somebody who will be attacked by the Character
     */

    public void attack(String parameter){

        System.out.println(this.name + ": Rrrrrrrrr....");
    }


    public void moveRight(){
        System.out.print(this.name + ": moves right");
    }

    public void moveLeft() {
        System.out.print(this.name + ": moves left");
    }

    public void moveForward() {
        System.out.print(this.name + ": moves forward");
    }

    public void moveBack(){
        System.out.print(this.name + ": moves back");
    }

    public final void unsheathes(){
        System.out.println(this.getName() + ": unsheathes his weapon");
    }

    public void moveDown(){

        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println(this.name + ": can not move down the ground....");
        }
    }
}
