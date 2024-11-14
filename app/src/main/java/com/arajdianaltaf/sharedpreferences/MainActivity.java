package com.arajdianaltaf.sharedpreferences;

import android.os.Bundle;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Switch swAutomaticUpdate;
    private Switch swSyncData;
    private Switch swNotif;
    private Switch swDarkMode;
    private Switch swUsageData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        // Mengubah View dari layout ke dalam bentuk objek View
        swAutomaticUpdate = findViewById(R.id.swAutomaticUpdate);
        swSyncData = findViewById(R.id.swSyncData);
        swNotif = findViewById(R.id.swNotif);
        swDarkMode = findViewById(R.id.swDarkMode);
        swUsageData = findViewById(R.id.swUsageData);

        // Mengubah status switch berdasarkan value dari shared preferences
        swAutomaticUpdate.setChecked(Preferences.getKeyAutoUpdate(this));
        swSyncData.setChecked(Preferences.getKeySyncData(this));
        swNotif.setChecked(Preferences.getKeyNotifications(this));
        swDarkMode.setChecked(Preferences.getKeyDarkMode(this));
        swUsageData.setChecked(Preferences.getKeyUsageData(this));

        // Mengubah status switch saat berubah
        swAutomaticUpdate.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Preferences.setKeyAutoUpdate(this, isChecked);
        });

        swSyncData.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Preferences.setKeySyncData(this, isChecked);
        });

        swNotif.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Preferences.setKeyNotifications(this, isChecked);
        });

        swDarkMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Preferences.setKeyDarkMode(this, isChecked);
        });

        swUsageData.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Preferences.setKeyUsageData(this, isChecked);
        });
    }
}