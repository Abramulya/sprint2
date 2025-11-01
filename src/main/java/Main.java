import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] agrs) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.FINAL_RED);
        Apple appleGreen =  new Apple(8, 60, Colour.FINAL_GREEN);
        Food[] foods = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.printf("Общая сумма товаров без скидки: %.2f рублей%n", cart.getTotalPriceWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f рублей%n", cart.getTotalPriceWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f рублей%n", cart.getTotalVegetarianPriceWithoutDiscount());
    }
}
