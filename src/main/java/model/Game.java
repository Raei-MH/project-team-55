package model;

public class Game {
    Player firstPlayer;
    Player secondPlayer;
    int rounds;

    public Game(Player firstPlayer, Player secondPlayer, Deck firstDeck, Deck secondDeck, int rounds) {
        setPlayers(firstPlayer, secondPlayer);
        setRounds(rounds);
        //?
    }

    private void createGameBoards() {

    }

    private void setPlayers(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public int getRounds() {
        return rounds;
    }
}
