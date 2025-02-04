package dev.adamag.number_games_lib.model;

public class CreateGameRequest {
    private int total_rounds;

    public CreateGameRequest(int total_rounds) {
        this.total_rounds = total_rounds;
    }

    public int getTotalRounds() {
        return total_rounds;
    }
}
