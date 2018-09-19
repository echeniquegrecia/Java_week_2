public class Warrior extends Character{

    protected static final String Class = "Warrior";

    public Warrior(String name){
        super(name);
        this.life = 100;
        this.agility = 8;
        this.strength = 10;
        this.wit = 3;
        System.out.println(this.name + ": My name will go down in history!");
    }

    public void attack(String weapon) {
        if (weapon.equals("hammer") || weapon.equals("sword")) {
            super.attack(weapon);
            System.out.println(this.name + ": I'll crush you with my " + weapon);
        }
    }

}