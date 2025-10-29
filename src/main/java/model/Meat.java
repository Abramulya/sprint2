package model;

public class Meat extends Food{
    public Meat(int amount, double price) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = false;
        }
    @Override
    public double getDiscount() {
        return 0;
    }
}
