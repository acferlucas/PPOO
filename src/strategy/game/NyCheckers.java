package strategy.game;

public class NyCheckers implements CheckersStrategy {
    @Override
    public void startGame() {
        System.out.println("New york way to star game");
    }

    @Override
    public void finishGame() {
        System.out.println("New york way to end game");
    }

    @Override
    public void eat() {
        System.out.println("New york eat a check");
    }
}
