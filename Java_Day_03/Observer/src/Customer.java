import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Customer implements IObserver{


    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(IObservable observable) {

        //System.out.println("Position: " + (new Order()).getPosition() + (new Order()).getTimeBeforeArrival() + " minutes before arrival at " + (new Order()).getDestination());
        ArrayList result = observable.getNotification();
        System.out.println(this.name + ": I got the following info: Position: " + result.get(0) + " " + result.get(1) + " minutes before arrival at " + result.get(2));

    }
}
