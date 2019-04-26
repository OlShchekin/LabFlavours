package Lab1.controller;

import Lab1.dataSource.FlavoursStore;
import Lab1.entities.Element;
import Lab1.model.Bouquet;
import Lab1.view.FlavourView;

import java.util.Scanner;

public class Controller {

    private Bouquet<? extends Element> modelElement = new Bouquet();
    private FlavourView view = new FlavourView();
    Scanner scan = new Scanner(System.in);

    public void run() {
        modelElement.setElements(FlavoursStore.getElements());
        String moreMenu = "Y";
        do {
            view.printMenu();
            view.printMessage("Choose a menu item (1-5):");
            int menuItem = getMenuItem();
            while (menuItem > 5 || menuItem < 1) {
                view.printMessage("Wrong number. Try again. ");
                menuItem = getMenuItem();
            }
            executeMenuItem(menuItem);
            view.printMessage("Back to menu? Y/N");
            moreMenu = scan.next();
        } while (moreMenu.equalsIgnoreCase("Y"));
    }

    private int getMenuItem() {
        while (!scan.hasNextInt()) {
            view.printMessage("Wrong input. Try again. ");
            scan.next();
        }
        return scan.nextInt();
    }

    private void executeMenuItem(int number) {
        switch (number) {
            case (1):
                view.printFlavour("All flavours and attributes:", modelElement.getElements());
                break;
            case (2):
                view.printResult("The total price of all flavours and attributes =  ", modelElement.getTotalPrice());
                break;
            case (3):
                view.printFlavour("Sorting by freshness:  ", modelElement.sortByFreshness());
                break;
            case (4):
                view.printFlavour("Find all flavours with the height <=50 sm:",
                        modelElement.findElementByRange(0,50));
                break;
            case (5):
                view.printMessage("Bye!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong number. Try again. ");
                break;
        }
    }
}
