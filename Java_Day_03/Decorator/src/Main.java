public class Main {
    public static void main(String[] args) {
        Warrior albert = new BasicWarrior();
        System.out.println("Albert has " + albert.getHtp() + " health points.");
        albert = new Shield(albert);
        System.out.println("Albert has " + albert.getHtp() + " health points.");

        Warrior georges = new KingWarrior();
        System.out.println("Georges has "+ georges.getHtp() + " health points and can hit " + georges.getDmg() + " damages");

        georges = new FireSword(georges);
        georges  = new Shield(georges);
        System.out.println("Georges has "+ georges.getHtp() + " health points.");
        System.out.println("Georges can hit "+ georges.getDmg() + " damages.");
    }
}
