package Lab1.model;

import Lab1.dataSource.FlavoursStore;
import Lab1.entities.Element;

import java.util.Arrays;
import java.util.Comparator;

public class Bouquet<T extends Element> {
    private Element[] elements;

    public Element[] getElements(){
        return elements;
    }

    public void setElements (Element[] elements) {
        this.elements = elements;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < elements.length; i++) {
            totalPrice += elements[i].getPrice();
        }

        return totalPrice;
    }

    public Element[] sortByFreshness(){
        Element[] temp;
        temp = FlavoursStore.getElements();
        Arrays.sort(temp, new Comparator<Element>(){
            @Override
            public int compare(Element o1, Element o2){
                return Integer.compare(o1.getFreshness(),o2.getFreshness());


            }
        });
        return temp;
    }

    public Element[] findElementByRange(double heightBegin, double heightEnd) {
        int count = 0, count2 = 0;
        for (Element elem : elements) {
            if (elem.getHeight() <= heightEnd && elem.getHeight() >= heightBegin) count++;
        }
        Element[] temp = new Element[count];
        for (Element elem : elements) {
            if (elem.getHeight() <= heightEnd && elem.getHeight() >= heightBegin) {
                temp[count2] = elem;
                count2++;
            }
        }

        return temp;
    }

}
