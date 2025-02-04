package dev.adamag.number_games_lib.model;

import java.util.Map;

public class GameResponse {
    private String game_id;
    private String message;
    private String session_url;  // Only applicable for game creation
    private String qr_code_base64; // Only applicable for game creation
    private int current_round;
    private String status;
    private int total_rounds;
    private Map<String, PlayerInfo> players;
    private Map<String, RoundResult> round_results;

    public String getGameId() {
        return game_id;
    }

    public String getMessage() {
        return message;
    }

    public String getSessionUrl() {
        return session_url;
    }

    public String getQrCodeBase64() {
        return qr_code_base64;
    }

    public int getCurrentRound() {
        return current_round;
    }

    public String getStatus() {
        return status;
    }

    public int getTotalRounds() {
        return total_rounds;
    }

    public Map<String, PlayerInfo> getPlayers() {
        return players;
    }

    public Map<String, RoundResult> getRoundResults() {
        return round_results;
    }

    // ✅ Inner class for player info
    public static class PlayerInfo {
        private String name;
        private Integer number;

        public String getName() {
            return name;
        }

        public Integer getNumber() {
            return number;
        }
    }

    // ✅ Inner class for round results
    public static class RoundResult {
        private String winner;
        private double winning_number;
        private int chosen_number;

        public String getWinner() {
            return winner;
        }

        public double getWinningNumber() {
            return winning_number;
        }

        public int getChosenNumber() {
            return chosen_number;
        }
    }
}
