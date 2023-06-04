package strategy.game;

public class BrazilianCheckers implements CheckersStrategy {
    @Override
    public void startGame() {
        System.out.println("Brazilian Checkers way to start game");
    }

    @Override
    public void finishGame() {
        System.out.println("Brazilian Checkers way to ebnd game");
    }

    @Override
    public void eat() {
        System.out.println("Brazilian Checkers way to eat a  check");
    }
}
