package fractory.pizza;

public class GreekPizza extends Pizza {
    public GreekPizza() {
        this.price = 29;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing a GreekPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking..... a GreekPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting..... a GreekPizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing..... a GreekPizza");
    }
}
