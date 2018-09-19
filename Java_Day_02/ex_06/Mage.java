public class Mage extends Character{


    protected static final String Class = "Mage";

    public Mage(String name, int magnetism){
        super(name);
        this.life = 70;
        this.agility = 10;
        this.strength = null;
        this.wit = 10;
        this.magnetism = magnetism;
        System.out.println(this.name + ": May the gods be with me.");
    }

    public void attack(String weapon) {

        try{

            if (weapon.equals("magic") || weapon.equals("wand")) {
                super.attack(weapon);
                System.out.println(this.name + ": Feel the power of my " + weapon + "!");

            }
            else{
                throw new WeaponException(this, this.name, weapon);

            }
        }catch (WeaponException e){
            System.out.println(e.getMessage());

        }

    }

    public void moveRight(){
        super.moveRight();
        System.out.println( " furtively.");
    }

    public void moveLeft(){
        super.moveLeft();
        System.out.println(" furtively.");
    }

    public void moveForward(){
        super.moveForward();
        System.out.println( " furtively.");
    }

    public void moveBack(){
        super.moveBack();
        System.out.println(" furtively.");
    }


}