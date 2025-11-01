package model;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{
    protected String colour;
    public Apple(int amount, double price, String colour) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = true;
        this.colour = colour;
    }
    @Override
    public double getDiscount() {
        if (Colour.FINAL_RED.equals(this.colour) ) {
            return Discount.DISCOUNT_YES;
        } else {
            return Discount.DISCOUNT_NO;
        }
    }
}
