import java.io.*;

public class WeaponException extends Exception{

    private String message;

    public WeaponException(Object character, String name, String weapon){
        if(weapon == ""){
            this.message = name + ": I refuse to fight with my bare hands.";
        }
        else if (character instanceof Warrior){
            this.message = name + ": A " + weapon + "?? What should I do with this?";
        }
        else if (character instanceof Mage){
            this.message = name + ": I don't need this stupid  " + weapon + "! Don't misjudge my powers!";
        }
    }

    public String getMessage() {
        return message;
    }


}