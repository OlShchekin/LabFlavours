package Lab1.entities;

public abstract class Element {
    private String name;
    private double price;
    private double height;
    private int freshness;

    Element(String name, int freshness, double price, double height){
        this.name = name;
        this.freshness = freshness;
        this.price = price;
        this.height = height;
    }
    public String getName() {

        return name;
    }
    public int getFreshness() {
        return freshness;
    }
    public double getHeight() {

        return height;
    }
    public double getPrice() {

        return price;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ". It is " + this.name + ": freshness - " + this.freshness + ", price - "
                + this.price + "$, height - " + this.height +"sm";
    }

}
