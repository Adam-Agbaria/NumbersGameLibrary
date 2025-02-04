package dev.adamag.number_games_lib.model;


public class JoinGameRequest {
    private String name;
    private String gameId;

    public JoinGameRequest() {
        // Default constructor for serialization
    }

    public JoinGameRequest(String name, String gameId) {
        this.name = name;
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
}
