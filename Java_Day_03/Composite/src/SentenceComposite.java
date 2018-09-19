import java.util.ArrayList;

public class SentenceComposite implements ISentence{

    private ArrayList ChildSentence = new ArrayList();

    public void add(ISentence word){
        ChildSentence.add(word);
    }

    public void remove(ISentence word){
        ChildSentence.remove(word);
    }

    @Override
    public void print() {
        for (int i = 0; i < ChildSentence.size(); i++){
            System.out.println(ChildSentence.get(i));

        }
    }
}
