package decorator.cofee;

public class Chocolate extends CondimentDecorator {

    Beverage beverage;

    public Chocolate( Beverage beverage ) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + 9;
    }

    @Override
    public String getDescription() {
        return "chocolate added";
    }
}
