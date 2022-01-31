package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            public void useAppContext( )
            {
                Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
                assertEquals("com.example.intent",appContext.getPackageName());
            }
        }
    }
}
