package cn.duanyufei.kiwivm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.duanyufei.kiwivm.model.LiveServiceInfo;
import cn.duanyufei.kiwivm.model.VzStatus;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "MainActivity";

    private TextView tvStatus;
    private TextView tvIpv4;
    private TextView tvIpv6;
    private TextView tvData;
    private TextView tvDate;
    private TextView tvData2;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvStatus = (TextView) findViewById(R.id.info_status);
        tvIpv4 = (TextView) findViewById(R.id.info_ipv4);
        tvIpv6 = (TextView) findViewById(R.id.info_ipv6);
        tvData = (TextView) findViewById(R.id.info_data_counter);
        tvData2 = (TextView) findViewById(R.id.info_data_counter2);
        tvDate = (TextView) findViewById(R.id.info_data_next_reset);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getLiveInfo();
                Toast.makeText(MainActivity.this, R.string.refresh, Toast.LENGTH_SHORT).show();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });

        getLiveInfo();
    }

    private void getLiveInfo() {

        fab.setClickable(false);

        Log.i(TAG, "init: ");
        NetUtil.getInstance(this).getMessage(AppDefine.SERVER + AppDefine.LIVE_SERVICE_INFO + AppDefine.ID,
                new NetUtil.MOkCallBack() {

                    @Override
                    public void onSuccess(String rep) {
                        LiveServiceInfo info = (LiveServiceInfo) GsonUtil.fromJson(rep, LiveServiceInfo.class);
                        updateTextView(info);
                        fab.setClickable(true);
                    }

                    @Override
                    public void onError() {
                        fab.setClickable(true);
                    }
                });
    }

    private void updateTextView(LiveServiceInfo info) {
        try {
            VzStatus status = info.getVz_status();
            tvStatus.setText(status.getStatus());
            tvIpv4.setText(info.getIp_addresses().get(0));
            tvIpv6.setText(info.getIp_addresses().get(1));
            long data = info.getData_counter();
            tvData2.setText(new DecimalFormat(",###").format(data)+" B");
            double doubleData = (double) data / 1024.0 / 1024.0 / 1024.0;
            String dispData = String.format("%.8f GB", doubleData);
            tvData.setText(dispData);
            Date time = new Date(info.getData_next_reset() * 1000);
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            String dispDate = String.format(format.format(time));
            tvDate.setText(dispDate);
        } catch (Exception e) {

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
