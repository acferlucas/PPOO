package decorator.cofee;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk( Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 1.99 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Add milk";
    }
}
