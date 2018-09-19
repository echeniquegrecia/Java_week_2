public class Main{

    public static void main(String[] args){
        Character perso = new Character("jean_luc");
        System.out.println(perso.getName());
        System.out.println(perso.getLife());
        System.out.println(perso.getAgility());
        System.out.println(perso.getStrength());
        System.out.println(perso.getWit());
        System.out.println(perso.getClass());
        perso.attack("who cares");

    }
}