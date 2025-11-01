package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;
    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food food : foods) {
            total = total + food.getAmount() * food.getPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food food : foods) {
            double discount = food.getDiscount();
            double priceWithDiscount = food.getPrice() * (100 - discount) / 100;
            total = total + food.getAmount() * priceWithDiscount;
        }
        return total;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (Food food : foods) {
            if (food.getIsVegetarian()) {
                total = total + food.getAmount() * food.getPrice();
            }
        }
        return total;
    }
}
