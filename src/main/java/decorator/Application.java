package decorator;

public class Application {

    public static void main(String args[]){

        // create a basic item
        BasicItem basicItem1 = new BaseItem1();
        System.out.println(basicItem1.getDescription()
                + " $" + basicItem1.cost());

        // decorate and wrap our item with other layers
        basicItem1 = new SpecialisedItem2(basicItem1);
        basicItem1 = new SpecialisedItem1(basicItem1);
        System.out.println(basicItem1.getDescription() + " , Total $" + basicItem1.cost());

        // Create another basic item
        BasicItem baseItem2 = new BaseItem2();
        System.out.println(baseItem2.getDescription()
                + " $" + baseItem2.cost());
        
        // decorate and wrap our item with other layers
        baseItem2 = new SpecialisedItem1(baseItem2);
        baseItem2 = new SpecialisedItem2(baseItem2);
        System.out.println(baseItem2.getDescription() + " , Total $" + baseItem2.cost());
    }
}
