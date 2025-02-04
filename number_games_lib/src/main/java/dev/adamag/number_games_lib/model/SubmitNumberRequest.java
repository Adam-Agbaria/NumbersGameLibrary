package dev.adamag.number_games_lib.model;

public class SubmitNumberRequest {
    private String game_id;
    private String player_id;
    private int number;

    public SubmitNumberRequest(String gameId, String playerId, int number) {
        this.game_id = gameId;
        this.player_id = playerId;
        this.number = number;
    }

    public String getGameId() {
        return game_id;
    }

    public void setGameId(String gameId) {
        this.game_id = gameId;
    }

    public String getPlayerId() {
        return player_id;
    }

    public void setPlayerId(String playerId) {
        this.player_id = playerId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
