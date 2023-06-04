package fractory.pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        this.price = 30;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing a ClamPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking..... a ClamPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting..... a ClamPizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing..... a ClamPizza");
    }
}
