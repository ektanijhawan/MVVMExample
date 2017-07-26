package ekta.mvvm.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ekta.mvvm.model.People;

/**
 * Created by Ekta on 26-07-2017.
 */


public class PeopleResponse {

    @SerializedName("results") private List<People> peopleList;

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> mPeopleList) {
        this.peopleList = mPeopleList;
    }
}
