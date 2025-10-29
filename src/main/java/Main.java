import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] agrs) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, "red");
        Apple appleGreen =  new Apple(8, 60, "green");
        Food[] foods = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount() + " рублей");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " рублей");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount() + " рублей");
    }
}
