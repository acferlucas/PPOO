package strategy.duck;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void swing() {
        System.out.println("Iam swing in the water");
    };

    public void display() {
        System.out.println("Iam a Duck");
    };
    public void performQuack() {
        this.quackBehavior.quack();
    };
    public void performFly() {
        this.flyBehavior.fly();
    };

}
