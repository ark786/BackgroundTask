package com.example.backgroundtask;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               whoa();
            }
        });
    }
    void whoa()
    {
        AlarmManager alarmManager= (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent intent= new Intent(this, alarmTrig.class);
        PendingIntent pendingIntent=PendingIntent.getBroadcast(this,0,intent,0);
        alarmManager.set(AlarmManager.RTC,System.currentTimeMillis()+10000,pendingIntent);

    }
}
