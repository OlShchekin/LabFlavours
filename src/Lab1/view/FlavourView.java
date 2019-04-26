package Lab1.view;

import Lab1.entities.Element;

public class FlavourView {
    public  void printMenu(){
        System.out.println("Welcome to the Flavour store");
        System.out.println("1. Print all elements from bouquet");
        System.out.println("2. Calculate the total price of bouquet");
        System.out.println("3. Sorting flavours by their freshness");
        System.out.println("4. Finding flavours in height range less than 50 sm");
        System.out.println("5. Exit");
    }

    public void printFlavour(String message, Element[] elements){
        System.out.println(message);
        for(Element element : elements) {
            System.out.println(element);
        }
    }
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResult(String message, double result) {
        System.out.println(message + result);
    }
}
