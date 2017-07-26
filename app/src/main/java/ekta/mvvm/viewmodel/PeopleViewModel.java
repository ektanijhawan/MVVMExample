package ekta.mvvm.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import ekta.mvvm.ApplicationExtension;
import ekta.mvvm.R;
import ekta.mvvm.data.PeopleService;
import io.reactivex.disposables.CompositeDisposable;

import ekta.mvvm.model.People;

/**
 * Created by Ekta on 26-07-2017.
 */

public class PeopleViewModel extends Observable {

    public ObservableInt peopleProgress;
    public ObservableInt peopleRecycler;
    public ObservableInt peopleLabel;
    public ObservableField<String> messageLabel;

    private List<People> peopleList;
    private Context context;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    public PeopleViewModel(@NonNull Context context) {

        this.context = context;
        this.peopleList = new ArrayList<>();
        peopleProgress = new ObservableInt(View.GONE);
        peopleRecycler = new ObservableInt(View.GONE);
        peopleLabel = new ObservableInt(View.VISIBLE);
        messageLabel = new ObservableField<>(context.getString(R.string.default_loading_people));
    }

    public void onClickFabLoad(View view) {
        initializeViews();
        fetchPeopleList();
    }

    //It is "public" to show an example of test
    public void initializeViews() {
        peopleLabel.set(View.GONE);
        peopleRecycler.set(View.GONE);
        peopleProgress.set(View.VISIBLE);
    }

    public void fetchPeopleList(){
        ApplicationExtension applicationExtension=  ApplicationExtension.create(context);
        PeopleService peopleService=applicationExtension.getPeopleService();
        Dispo

    }
}
