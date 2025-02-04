package dev.adamag.number_games_lib.network;



import dev.adamag.number_games_lib.model.GameResultsResponse;
import dev.adamag.number_games_lib.model.GameStatusResponse;
import retrofit2.Call;
import dev.adamag.number_games_lib.model.GameResponse;
import dev.adamag.number_games_lib.model.JoinGameRequest;
import dev.adamag.number_games_lib.model.SubmitNumberRequest;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GameApiService {

    @POST("/game/join")
    Call<GameResponse> joinGame(@Body JoinGameRequest request);

    @POST("/game/submit")
    Call<GameResponse> submitNumber(@Body SubmitNumberRequest request);

    @GET("/game/status/{gameId}")
    Call<GameStatusResponse> getGameStatus(@Path("gameId") String gameId);

    @GET("/game/results/{gameId}")
    Call<GameResultsResponse> getGameResults(@Path("gameId") String gameId);
}
