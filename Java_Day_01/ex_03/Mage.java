public class Mage extends Character{


    protected static final String Class = "Mage";

    public Mage(String name){
        super(name);
        this.life = 70;
        this.agility = 10;
        this.strength = 3;
        this.wit = 10;
        System.out.println(this.name + ": May the gods be with me.");
    }

    public void attack(String weapon) {
        if (weapon.equals("magic") || weapon.equals("wand")) {
            super.attack(weapon);
            System.out.println(this.name + ": Feel the power of my " + weapon + "!");
        }
    }


}