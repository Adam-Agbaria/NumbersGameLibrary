package dev.adamag.number_games_lib.model;

public class NextRoundRequest {
    private String game_id;

    public NextRoundRequest(String game_id) {
        this.game_id = game_id;
    }

    public String getGameId() {
        return game_id;
    }
}
