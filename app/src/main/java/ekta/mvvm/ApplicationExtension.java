package ekta.mvvm;

import android.app.Application;
import android.content.Context;

import ekta.mvvm.data.PeopleFactory;
import ekta.mvvm.data.PeopleService;
import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by Ekta on 26-07-2017.
 */

public class ApplicationExtension extends Application {


    private PeopleService peopleService;
    private Scheduler scheduler;
    private static ApplicationExtension get(Context context){
        return (ApplicationExtension) context.getApplicationContext();
    }

    public static ApplicationExtension create(Context context){
        return ApplicationExtension.create(context);
    }
    public PeopleService getPeopleService() {
        if (peopleService == null) {
            peopleService = PeopleFactory.create();
        }

        return peopleService;
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) {
            scheduler = Schedulers.io();
        }

        return scheduler;
    }

    public void setPeopleService(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }
}
