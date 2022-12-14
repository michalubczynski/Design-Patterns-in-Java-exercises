package Kompozyt;

public class MenuItem extends MenuComponent{
    String name;
    double price;

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void print(){
        System.out.println(" " + getName());
    }
}
