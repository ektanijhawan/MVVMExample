package ekta.mvvm.data;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ekta on 26-07-2017.
 */

public class PeopleFactory {

    private final static String BASE_URL = "http://api.randomuser.me/";
    public final static String RANDOM_USER_URL = "http://api.randomuser.me/?results=10&nat=en";
    public final static String PROJECT_URL = "https://github.com/erikcaffrey/People-MVVM";

    public static PeopleService create() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(PeopleService.class);
    }
}