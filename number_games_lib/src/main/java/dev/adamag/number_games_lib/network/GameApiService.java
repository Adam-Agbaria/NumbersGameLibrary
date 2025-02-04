package dev.adamag.number_games_lib.network;

import dev.adamag.number_games_lib.model.CalculateWinnerRequest;
import dev.adamag.number_games_lib.model.GameResponse;
import dev.adamag.number_games_lib.model.JoinGameRequest;
import dev.adamag.number_games_lib.model.StartGameRequest;
import dev.adamag.number_games_lib.model.SubmitNumberRequest;
import dev.adamag.number_games_lib.model.GameStatusResponse;
import dev.adamag.number_games_lib.model.GameResultsResponse;
import dev.adamag.number_games_lib.model.CreateGameRequest;
import dev.adamag.number_games_lib.model.CreateGameResponse;
import dev.adamag.number_games_lib.model.NextRoundRequest;
import dev.adamag.number_games_lib.model.EndRoundRequest;
import dev.adamag.number_games_lib.model.RoundWinnerResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GameApiService {

    // ✅ Create a new game
    @POST("/game/create")
    Call<CreateGameResponse> createGame(@Body CreateGameRequest request);

    // ✅ Join an existing game
    @POST("/game/join")
    Call<GameResponse> joinGame(@Body JoinGameRequest request);

    // ✅ Start the game
    @POST("/game/start")
    Call<GameResponse> startGame(@Body StartGameRequest request);

    // ✅ Move to the next round
    @POST("/game/next_round")
    Call<GameResponse> nextRound(@Body NextRoundRequest request);

    // ✅ End the round manually
    @POST("/game/end_round")
    Call<GameResponse> endRound(@Body EndRoundRequest request);

    // ✅ Submit a number for the current round
    @POST("/round/submit")
    Call<GameResponse> submitNumber(@Body SubmitNumberRequest request);

    // ✅ Fetch the game status
    @GET("/game/status/{gameId}")
    Call<GameStatusResponse> getGameStatus(@Path("gameId") String gameId);

    // ✅ Fetch game results
    @GET("/game/results")
    Call<GameResultsResponse> getGameResults(@Query("game_id") String gameId);

    // ✅ Determine the winner of the current round
    @POST("/round/calculate_winner")
    Call<RoundWinnerResponse> calculateWinner(@Body CalculateWinnerRequest request);
}
