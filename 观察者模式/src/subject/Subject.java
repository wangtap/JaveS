package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject   {
    private List<Observer> observers =new ArrayList<Observer>();

    //添加观察者
    public void add(Observer observer){
            observers.add(observer);
    }

    //删除观察者
    public void delect(Observer observer){
        observers.remove(observer);

    }

        //通知
    public void notify(String message){
        for (Observer observer : observers) {
            observer.update(message);
        }

    }

}
