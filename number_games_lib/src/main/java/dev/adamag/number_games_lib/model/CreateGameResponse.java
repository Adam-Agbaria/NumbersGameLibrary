package dev.adamag.number_games_lib.model;

public class CreateGameResponse {
    private String game_id;
    private String session_url;
    private String qr_code_base64;
    private String message;

    public String getGameId() {
        return game_id;
    }

    public String getSessionUrl() {
        return session_url;
    }

    public String getQrCodeBase64() {
        return qr_code_base64;
    }

    public String getMessage() {
        return message;
    }
}
