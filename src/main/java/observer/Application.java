package observer;

import java.util.Scanner;

public class Application {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        DataObject dataObj = new DataObject();
        
        System.out.println("Welcome to the Observer pattern, enter the number of subscribers as an int:");
        int subs = scanner.nextInt();

        for(int i = 0; i < subs; i++){
            new ConcreteSubscriberOne(dataObj);
        }

        while(true){
            System.out.println("Enter subjects first float param value:");
            float input1 = scanner.nextLong();
            System.out.println("Enter subjects second float param value:");
            float input2 = scanner.nextLong();
            dataObj.setData(input1, input2);
        }
    }

}
