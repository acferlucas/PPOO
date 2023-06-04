package fractory.pizza;

public class CheesePizza extends Pizza {
    CheesePizza() {
        this.price = 25;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing a Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking..... a Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting..... a Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing..... a Cheese Pizza");
    }
}
