package dev.adamag.number_games_lib.model;


public class GameResponse {
    private boolean success;
    private String message;

    public GameResponse() {
        // Default constructor for serialization
    }

    public GameResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
