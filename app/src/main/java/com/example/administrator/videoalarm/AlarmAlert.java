package com.example.administrator.videoalarm;

import android.app.Activity;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class AlarmAlert extends Activity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mediaPlayer = MediaPlayer.create(this,R.raw.clock_alarm);
        mediaPlayer.start();
        new AlertDialog.Builder(AlarmAlert.this).setIcon(R.drawable.clock).setTitle("It's Time!!").setMessage("时间到了!").setPositiveButton("知道了",
                new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlarmAlert.this.finish();
                        mediaPlayer.stop();;
                    }

                }).show();
    }
}
