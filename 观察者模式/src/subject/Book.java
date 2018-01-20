package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Book  extends  Subject{
    private String bname;
    private List<Observer> observers=new ArrayList<Observer>();

    public Book(String bname) {
        this.bname = bname;
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delect(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(bname+message);
        }
    }
}
