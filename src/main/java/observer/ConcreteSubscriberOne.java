package observer;

public class ConcreteSubscriberOne implements Observer, Subscriber {

    private float field1;
    private float field2;
    private Subject subject;

    public ConcreteSubscriberOne(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    
    public void update(float var1, float var2) {
        this.field1 = var1;
        this.field2 = var2;
        display();
    }

    public void display() {
        System.out.println("UPDATE - Object "+ this.toString() +"Data: " + field1 + "F degrees and " + field2 + "% humidity");
    }
}
