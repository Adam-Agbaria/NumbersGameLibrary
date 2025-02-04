package dev.adamag.number_games_lib.model;

public class GameStatusResponse {
    private String status;

    public GameStatusResponse() {
        // Default constructor for serialization
    }

    public GameStatusResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
