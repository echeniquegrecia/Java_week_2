import java.util.ArrayList;
import java.util.Observer;

public interface IObservable {

    void setObserver(ArrayList observers);
    void deleteObserver(IObserver observer);
    boolean notifyObserver();
    ArrayList getNotification();
    void notify(IObserver observer);
}
