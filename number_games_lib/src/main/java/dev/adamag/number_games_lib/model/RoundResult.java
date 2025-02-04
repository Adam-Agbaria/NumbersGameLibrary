package dev.adamag.number_games_lib.model;

public class RoundResult {
    private int round;
    private int winningNumber;
    private String winner;

    public RoundResult() {
        // Default constructor for serialization
    }

    public RoundResult(int round, int winningNumber, String winner) {
        this.round = round;
        this.winningNumber = winningNumber;
        this.winner = winner;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getWinningNumber() {
        return winningNumber;
    }

    public void setWinningNumber(int winningNumber) {
        this.winningNumber = winningNumber;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
