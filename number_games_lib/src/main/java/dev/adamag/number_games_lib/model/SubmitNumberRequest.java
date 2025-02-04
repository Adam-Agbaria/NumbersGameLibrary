package dev.adamag.number_games_lib.model;


public class SubmitNumberRequest {
    private String gameId;
    private int number;

    public SubmitNumberRequest() {
        // Default constructor for serialization
    }

    public SubmitNumberRequest(String gameId, int number) {
        this.gameId = gameId;
        this.number = number;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

