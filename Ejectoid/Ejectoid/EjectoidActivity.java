package com.trompogames.Ejectoid;

import android.app.Activity;
import android.os.Bundle;
import com.apportable.RuntimeService;

public class EjectoidActivity extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new RuntimeService(this).loadLibraries();
        run();
    }
    public native void run();
}