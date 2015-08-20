package decorator;

public class SpecialisedItem1 extends ItemDecorator {

    BasicItem item;
    double cost = .20;
    
    public SpecialisedItem1(BasicItem item){
        this.item = item;
    }
    
    public String getDescription(){
        return item.getDescription() + ", adding specialised item 1 $" + cost;
    }

    public double cost(){
        return cost + item.cost();
    }
}
