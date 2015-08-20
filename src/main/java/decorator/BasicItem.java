package decorator;

public abstract class BasicItem {
    String description = "Unknown item";
    
    public String getDescription(){
        return description;
    }
    
    public abstract double cost();
}
