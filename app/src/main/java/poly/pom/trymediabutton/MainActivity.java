package poly.pom.trymediabutton;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import poly.pom.trymediabutton.Receiver.MediumButtonReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*MediumButtonReceiver myMediumReceiver = new MediumButtonReceiver();
        IntentFilter intentFilter=new IntentFilter("android.intent.action.MEDIA_BUTTON");
        this.registerReceiver(myMediumReceiver,intentFilter);*/

        MediaSession mSession =  new MediaSession(this,this.getPackageName());
        Intent intent = new Intent(this, MediumButtonReceiver.class);
        PendingIntent pintent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        mSession.setMediaButtonReceiver(pintent);
        mSession.setActive(true);
    }

}

