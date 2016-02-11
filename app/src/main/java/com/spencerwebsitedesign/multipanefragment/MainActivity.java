package com.spencerwebsitedesign.multipanefragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        int screenOrientation = getResources().getConfiguration().orientation;

        if (screenOrientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSidePanel();
        }

    }

    private void hideSidePanel()
    {
        View sidePane = findViewById(R.id.side_panel);

        if(sidePane.getVisibility() == View.VISIBLE)
        {
            sidePane.setVisibility(View.GONE);
        }
    }
}
