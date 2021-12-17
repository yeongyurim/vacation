package com.example.vacation;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);

        intent = new Intent().setClass(this, keyword.class);
        spec = tabHost.newTabSpec("Keyword");
        spec.setIndicator("키워드 ");
        spec.setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, choose.class);
        spec = tabHost.newTabSpec("Choose");
        spec.setIndicator("월드컵 ");
        spec.setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, exhibition.class);
        spec = tabHost.newTabSpec("exhibition");
        spec.setIndicator("전시회 ");
        spec.setContent(intent);
        tabHost.addTab(spec);


        tabHost.setCurrentTab(0);

    }

}