import java.util.ArrayList;

public class Order implements IObservable{

    private String position;
    private String destination;
    private int timeBeforeArrival;
    private ArrayList<IObserver> observers = new ArrayList();

    public String getPosition() {
        return position;
    }

    public String getDestination() {
        return destination;
    }

    public int getTimeBeforeArrival() {
        return timeBeforeArrival;
    }

    public void setData(String position, String destination, int timeBeforeArrival){
        this.position = position;
        this.destination = destination;
        this.timeBeforeArrival = timeBeforeArrival;
        if(notifyObserver()){
            for(int i = 0; i <observers.size(); i++){
                this.notify(observers.get(i));
            }
        }
    }


    @Override
    public void setObserver(ArrayList observers) {
        this.observers = observers;
    }

    @Override
    public void deleteObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public boolean notifyObserver() {
       return this.observers.size() > 0 ;
    }

    public void notify(IObserver observer){
        observer.update(this);
    }

    @Override
    public ArrayList getNotification(){
        ArrayList list = new ArrayList();
        list.add(getPosition());
        list.add(getTimeBeforeArrival());
        list.add(getDestination());
        return list;
    }
}
