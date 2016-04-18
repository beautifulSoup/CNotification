package net.sixwolf.CNotification;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.show);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResidentNotificationHelper.sendResidentNoticeType0(MainActivity.this, "Test", "TestContent", R.drawable.logo);
            }
        });

        Button btn2 = (Button) findViewById(R.id.show2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResidentNotificationHelper.sendDefaultNotice(MainActivity.this, "Test", "TestContent", R.drawable.logo);
            }
        });
    }
}
