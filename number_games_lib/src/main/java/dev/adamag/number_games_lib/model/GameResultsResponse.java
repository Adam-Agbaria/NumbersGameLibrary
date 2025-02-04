package dev.adamag.number_games_lib.model;

import java.util.List;

public class GameResultsResponse {
    private String winner;
    private List<RoundResult> rounds;

    public GameResultsResponse() {
        // Default constructor for serialization
    }

    public GameResultsResponse(String winner, List<RoundResult> rounds) {
        this.winner = winner;
        this.rounds = rounds;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public List<RoundResult> getRounds() {
        return rounds;
    }

    public void setRounds(List<RoundResult> rounds) {
        this.rounds = rounds;
    }
}
