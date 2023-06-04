package strategy.duck;

public class RegulaQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Regular:  QUACK!, QUACK! ,QUACK!");
    }
}
