package com.example.android.sunshine2.app.sync;

import android.content.Intent;
import android.os.IBinder;
import android.app.Service;

/**
 * Created by Dell on 11-07-2016.
 */
public class SunshineAuthenticatorService extends Service {
    // Instance field that stores the authenticator object
    private SunshineAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new SunshineAuthenticator(this);
    }

    /*
+     * When the system binds to this Service to make the RPC call
+     * return the authenticator's IBinder.
+     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
