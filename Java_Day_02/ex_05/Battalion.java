import java.util.List;
import java.util.ArrayList;

public class Battalion{

    private List<Character> characters =  new ArrayList<>();

    public Battalion() {
    }


    public List<Character> add(List<? extends Character> character){
        characters.addAll(character);
        return characters;
    }

    public void display(){
        for(int i=0; i<characters.size(); i++){
            System.out.print(characters.get(i).getName() + " ");
        }
        System.out.println("");
    }

}