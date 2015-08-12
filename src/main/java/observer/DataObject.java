package observer;

import java.util.ArrayList;

public class DataObject implements Subject {
    
    private ArrayList observers;
    private float var1;
    private float var2;
    
    public DataObject(){
        observers = new ArrayList();
    }
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }


    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }
    
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(var1, var2);
        }
    }
    
    public void dataChanged(){
        notifyObservers();
    }
    
    public void setData(float var1, float var2){
        this.var1 = var1;
        this.var2 = var2;
        dataChanged();
    }

}
