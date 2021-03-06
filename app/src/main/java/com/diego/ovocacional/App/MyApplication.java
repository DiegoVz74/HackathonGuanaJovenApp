package com.diego.ovocacional.App;

import android.app.Application;

import com.diego.ovocacional.models.Carrera;
import com.diego.ovocacional.models.Universidad;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MyApplication extends Application {
/*
    public static AtomicInteger UniversidadID = new AtomicInteger();
    public static AtomicInteger CarreraID = new AtomicInteger();

    @Override
    public void onCreate() {
        setupRealmConfig();

        Realm realm = Realm.getDefaultInstance();
        UniversidadID = getIdByTable(realm, Universidad.class);
        CarreraID = getIdByTable(realm,Carrera.class);
        realm.close();
    }

    private void setupRealmConfig() {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
    }


    private<T extends RealmObject> AtomicInteger getIdByTable(Realm realm, Class<T> anyClass){
        RealmResults<T> results = realm.where(anyClass).findAll();
        return (results.size() > 0) ? new AtomicInteger(results.max("id").intValue()): null;

    }

*/



}
