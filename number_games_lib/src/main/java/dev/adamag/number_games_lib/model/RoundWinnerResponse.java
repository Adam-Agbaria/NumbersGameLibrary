package dev.adamag.number_games_lib.model;

public class RoundWinnerResponse {
    private String winner;
    private double winning_number;
    private double chosen_number;

    public String getWinner() {
        return winner;
    }

    public double getWinningNumber() {
        return winning_number;
    }

    public double getChosenNumber() {
        return chosen_number;
    }
}
