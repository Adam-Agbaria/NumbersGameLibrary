package dev.adamag.number_games_lib.network;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GameApiClient {
    private static final String BASE_URL = "numbers-game-server-sdk-kpah.vercel.app";

    private static GameApiService gameApiService;

    public static GameApiService getInstance() {
        if (gameApiService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()) // Converts JSON responses into Java objects
                    .build();

            gameApiService = retrofit.create(GameApiService.class);
        }
        return gameApiService;
    }
}