package com.trompogames.Ejectoid;

import android.app.Activity;
import android.os.Bundle;
import com.apportable.RuntimeService;
import android.view.WindowManager;

public class EjectoidActivity extends Activity
{
    
    public native void run();
    
    private EjectoidGLView m_glView;
    
    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        new RuntimeService(this).loadLibraries();
        
        m_glView = new EjectoidGLView(getApplication());
        setContentView(m_glView);
        
        //run();
    }
    
    @Override
    protected void onPause()
    {
        super.onPause();
        m_glView.onPause();
    }
    
    @Override
    protected void onResume()
    {
        super.onResume();
        m_glView.onResume();
    }
}