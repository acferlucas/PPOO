import decorator.print.NumeroUm;
import decorator.print.NumeroUmConcretClass;
import decorator.print.NumeroUmDecoratorColchetes;
import decorator.print.NumeroUmParentesesDecorator;
import fractory.pizza.*;
import singleton.chocolate.ChocolateBoiler;
import strategy.game.BrazilianCheckers;
import strategy.game.Checkers;
import strategy.game.NyCheckers;
import strategy.ordination.BubbleSort;
import strategy.ordination.Sort;

public class Main {
    public static void main(String[] args) {
        BrazilianCheckers brazilianCheckers = new BrazilianCheckers();
        NyCheckers nyCheckers = new NyCheckers();

        Checkers game = new Checkers();

        game.setGameStrategy(brazilianCheckers);
        game.performStartGame();
        game.performEndGame();

        game.setGameStrategy(nyCheckers);
        game.performStartGame();
        game.performEndGame();


    }
}