package ekta.mvvm.data;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by Ekta on 26-07-2017.
 */
public interface PeopleService {

    @GET
    Observable<PeopleResponse> fetchPeople(@Url String url);

}
