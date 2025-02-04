package dev.adamag.number_games_lib;

import dev.adamag.number_games_lib.model.*;
import dev.adamag.number_games_lib.network.GameApiClient;
import dev.adamag.number_games_lib.network.GameApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GameManager {
    private final GameApiService apiService;

    public GameManager() {
        this.apiService = GameApiClient.getInstance();
    }

    // ✅ Create Game
    public void createGame(int totalRounds, GameCallback<CreateGameResponse> callback) {
        CreateGameRequest request = new CreateGameRequest(totalRounds);
        Call<CreateGameResponse> call = apiService.createGame(request);
        call.enqueue(new Callback<CreateGameResponse>() {
            @Override
            public void onResponse(Call<CreateGameResponse> call, Response<CreateGameResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to create game: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<CreateGameResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

    // ✅ Join Game
    public void joinGame(String gameId, String playerName, GameCallback<GameResponse> callback) {
        JoinGameRequest request = new JoinGameRequest(gameId, playerName);
        Call<GameResponse> call = apiService.joinGame(request);
        call.enqueue(new Callback<GameResponse>() {
            @Override
            public void onResponse(Call<GameResponse> call, Response<GameResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to join game: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GameResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

    // ✅ Start Game
    public void startGame(String gameId, GameCallback<GameResponse> callback) {
        StartGameRequest request = new StartGameRequest(gameId);
        Call<GameResponse> call = apiService.startGame(request);
        call.enqueue(new Callback<GameResponse>() {
            @Override
            public void onResponse(Call<GameResponse> call, Response<GameResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to start game: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GameResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

    // ✅ End Round
    public void endRound(String gameId, GameCallback<GameResponse> callback) {
        EndRoundRequest request = new EndRoundRequest(gameId);
        Call<GameResponse> call = apiService.endRound(request);
        call.enqueue(new Callback<GameResponse>() {
            @Override
            public void onResponse(Call<GameResponse> call, Response<GameResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to end round: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GameResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

    // ✅ Move to Next Round
    public void nextRound(String gameId, GameCallback<GameResponse> callback) {
        NextRoundRequest request = new NextRoundRequest(gameId);
        Call<GameResponse> call = apiService.nextRound(request);
        call.enqueue(new Callback<GameResponse>() {
            @Override
            public void onResponse(Call<GameResponse> call, Response<GameResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to move to next round: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GameResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

    // ✅ Submit Number
    public void submitNumber(String gameId, String playerId, int number, GameCallback<GameResponse> callback) {
        SubmitNumberRequest request = new SubmitNumberRequest(gameId, playerId, number);
        Call<GameResponse> call = apiService.submitNumber(request);
        call.enqueue(new Callback<GameResponse>() {
            @Override
            public void onResponse(Call<GameResponse> call, Response<GameResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to submit number: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GameResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

    // ✅ Get Game Status
    public void getGameStatus(String gameId, GameCallback<GameStatusResponse> callback) {
        Call<GameStatusResponse> call = apiService.getGameStatus(gameId);
        call.enqueue(new Callback<GameStatusResponse>() {
            @Override
            public void onResponse(Call<GameStatusResponse> call, Response<GameStatusResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to fetch game status: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GameStatusResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

    // ✅ Get Game Results
    public void getGameResults(String gameId, GameCallback<GameResultsResponse> callback) {
        Call<GameResultsResponse> call = apiService.getGameResults(gameId);
        call.enqueue(new Callback<GameResultsResponse>() {
            @Override
            public void onResponse(Call<GameResultsResponse> call, Response<GameResultsResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to fetch game results: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<GameResultsResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }

    // ✅ Calculate Winner
    public void calculateWinner(String gameId, GameCallback<RoundWinnerResponse> callback) {
        CalculateWinnerRequest request = new CalculateWinnerRequest(gameId);
        Call<RoundWinnerResponse> call = apiService.calculateWinner(request);
        call.enqueue(new Callback<RoundWinnerResponse>() {
            @Override
            public void onResponse(Call<RoundWinnerResponse> call, Response<RoundWinnerResponse> response) {
                if (response.isSuccessful()) {
                    callback.onSuccess(response.body());
                } else {
                    callback.onError("Failed to calculate winner: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<RoundWinnerResponse> call, Throwable t) {
                callback.onError("Error: " + t.getMessage());
            }
        });
    }


    // ✅ Generic Callback Interface
    public interface GameCallback<T> {
        void onSuccess(T response);
        void onError(String errorMessage);
    }
}
