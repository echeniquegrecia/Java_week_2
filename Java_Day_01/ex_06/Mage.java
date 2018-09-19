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

        try{

            if (weapon.equals("magic") || weapon.equals("wand")) {
                super.attack(weapon);
                System.out.println(this.name + ": Feel the power of my " + weapon + "!");

            }
            else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println(this.name + ": I don't need this stupid  " + weapon + "! Don't misjudge my powers!");
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