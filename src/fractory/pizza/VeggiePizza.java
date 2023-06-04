package fractory.pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        this.price = 39;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing a VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking..... a VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting..... a VeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing..... a VeggiePizza");
    }
}
