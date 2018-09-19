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

        try{
            if (weapon.equals("hammer")  || weapon.equals("sword") ) {
                super.attack(weapon);
                System.out.println(this.name + ": I'll crush you with my " + weapon + "!");

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
        System.out.println(" like a bad boy.");
    }

    public void moveLeft(){
        super.moveLeft();
        System.out.println(" like a bad boy.");
    }

    public void moveForward(){
        super.moveForward();
        System.out.println(" like a bad boy.");
    }

    public void moveBack(){
        super.moveBack();
        System.out.println(" like a bad boy.");
    }

}