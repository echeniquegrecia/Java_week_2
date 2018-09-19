public class Main{

    public static void main(String[] args){
        Warrior warrior = new Warrior("Jean-Luc");
        Mage mage = new Mage("Robert");
        warrior.moveRight();
        warrior.moveDown();
        warrior.moveUp();
        mage.moveRight();
        mage.moveDown();
        mage.moveUp();
    }
}