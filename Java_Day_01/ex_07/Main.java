public class Main{

    public static void main(String[] args){
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");
        warrior.attack("screwdriver");
        mage.attack("hammer");
        warrior.attack("hammer");
        mage.attack("");
        warrior.attack("");
    }
}