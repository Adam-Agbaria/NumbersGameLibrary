package dev.adamag.number_games_lib.model;

public class EndRoundRequest {
    private String game_id;

    public EndRoundRequest(String game_id) {
        this.game_id = game_id;
    }

    public String getGameId() {
        return game_id;
    }
}
