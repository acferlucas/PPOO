package strategy.duck;

public class MallardDuck extends Duck {
    public MallardDuck () {
        quackBehavior = new RegulaQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display () {
        System . out . println (" Eu sou um Pato Real !");
    }
}
