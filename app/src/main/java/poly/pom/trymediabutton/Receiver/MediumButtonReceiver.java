package poly.pom.trymediabutton.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;

public class MediumButtonReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // 获得Action
        String intentAction = intent.getAction();
        // 获得KeyEvent对象
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);

        Log.d("Receive", intentAction + ": " + keyEvent.getKeyCode());
    }
}
