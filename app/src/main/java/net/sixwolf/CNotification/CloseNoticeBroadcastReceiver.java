package net.sixwolf.CNotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by kris on 16/4/14.
 */
public class CloseNoticeBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int noticeId = intent.getIntExtra(ResidentNotificationHelper.NOTICE_ID_KEY, -1);
        if(noticeId != -1){
            ResidentNotificationHelper.clearNotification(context, noticeId);
        }
    }
}
