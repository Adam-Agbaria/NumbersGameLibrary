package dev.adamag.number_games_lib;


import android.util.Log;

import dev.adamag.number_games_lib.model.GameResponse;
import dev.adamag.number_games_lib.model.JoinGameRequest;
import dev.adamag.number_games_lib.model.SubmitNumberRequest;
import dev.adamag.number_games_lib.network.GameApiClient;
import dev.adamag.number_games_lib.network.GameApiService;

import dev.adamag.number_games_lib.network.GameApiClient;
import dev.adamag.number_games_lib.network.GameApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GameManager {

    private static final String TAG = "GameManager";
    private final GameApiService apiService;

    public GameManager() {
        this.apiService = GameApiClient.getApiService();
    }

    public void joinGame(String name, String gameId, GameCallback callback) {
        JoinGameRequest request = new JoinGameRequest(name, gameId);
        apiService.joinGame(request).enqueue(new Callback<GameResponse>() {
            @Override
            public void onResponse(Call<GameResponse> call, Response<GameResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.onSuccess(response.body().getMessage());
                } else {
                    callback.onFailure("Failed to join game");
                }
            }

            @Override
            public void onFailure(Call<GameResponse> call, Throwable t) {
                Log.e(TAG, "Error joining game", t);
                callback.onFailure(t.getMessage());
            }
        });
    }

    public void submitNumber(String gameId, int number, GameCallback callback) {
        SubmitNumberRequest request = new SubmitNumberRequest(gameId, number);
        apiService.submitNumber(request).enqueue(new Callback<GameResponse>() {
            @Override
            public void onResponse(Call<GameResponse> call, Response<GameResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.onSuccess(response.body().getMessage());
                } else {
                    callback.onFailure("Failed to submit number");
                }
            }

            @Override
            public void onFailure(Call<GameResponse> call, Throwable t) {
                Log.e(TAG, "Error submitting number", t);
                callback.onFailure(t.getMessage());
            }
        });
    }

    public interface GameCallback {
        void onSuccess(String message);
        void onFailure(String error);
    }
}
