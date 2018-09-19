public class Main{

    public static void main(String[] args){
        Warrior warrior = new Warrior("Jean-Luc");
        Mage mage = new Mage("Robert");

        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveForward();
        warrior.moveBack();

        mage.moveRight();
        mage.moveLeft();
        mage.moveForward();
        mage.moveBack();
    }
}