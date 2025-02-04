package dev.adamag.number_games_lib.model;

public class StartGameRequest {
    private String game_id;

    public StartGameRequest(String gameId) {
        this.game_id = gameId;
    }

    public String getGameId() {
        return game_id;
    }

    public void setGameId(String gameId) {
        this.game_id = gameId;
    }
}
