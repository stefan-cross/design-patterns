package decorator;

public class SpecialisedItem2 extends ItemDecorator {

    BasicItem item;
    double cost = .89;

    public SpecialisedItem2(BasicItem item){
        this.item = item;
    }
    
    public String getDescription(){
        return item.getDescription() + ", adding specialised item 2 $" + cost;
    }

    public double cost(){
        return cost + item.cost();
    }
}
