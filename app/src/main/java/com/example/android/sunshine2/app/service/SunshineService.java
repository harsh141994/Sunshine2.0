package com.example.android.sunshine2.app.service;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by Dell on 11-07-2016.
 */
public class SunshineService extends IntentService {


    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public SunshineService() {
        super("SunshineService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
