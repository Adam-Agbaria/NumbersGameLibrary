package dev.adamag.number_games_lib.model;

public class CalculateWinnerRequest {
    private String game_id;

    public CalculateWinnerRequest(String gameId) {
        this.game_id = gameId;
    }

    public String getGameId() {
        return game_id;
    }

    public void setGameId(String gameId) {
        this.game_id = gameId;
    }
}
