package restproject.eservices.mickaelmatuchak.restproject.client;

import retrofit2.Retrofit;
import retrofit2.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String urlApi) {
        /*
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                .baseUrl(urlApi)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        */
        return retrofit;
    }
}
