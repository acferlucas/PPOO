package fractory.pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        this.price = 30;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing a PepperoniPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking..... a PepperoniPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting..... a PepperoniPizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing..... a PepperoniPizza");
    }
}
