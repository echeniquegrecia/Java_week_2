public class Character{

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected static final String Class = "Character";


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


    public void attack(String parameter){
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

}