package strategy.game;

public class Checkers {

    CheckersStrategy checkersStrategy;

    public Checkers() {}

    public void setGameStrategy( CheckersStrategy checkersStrategy ) {
        this.checkersStrategy = checkersStrategy;
    }
    public void performStartGame() {
        this.checkersStrategy.startGame();
    }
    public void performEndGame() {
        this.checkersStrategy.finishGame();
    }

}
