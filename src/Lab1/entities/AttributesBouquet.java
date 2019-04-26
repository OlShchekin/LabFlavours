package Lab1.entities;

public class AttributesBouquet extends Element {

    public  AttributesBouquet(String name, int freshness, double price, double height){
        super(name, freshness, price, height);

    }
    @Override
    public  String toString(){
        //no flavors
        return  super.toString();
    }

}
