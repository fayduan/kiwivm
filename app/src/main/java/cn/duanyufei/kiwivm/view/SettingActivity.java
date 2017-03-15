package cn.duanyufei.kiwivm.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import cn.duanyufei.kiwivm.R;
import cn.duanyufei.kiwivm.util.StorageUtil;
import cn.duanyufei.kiwivm.util.ToastUtil;

public class SettingActivity extends AppCompatActivity {

    private EditText etId;
    private EditText etKey;
    private EditText etTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        etId = (EditText) findViewById(R.id.et_id);
        etKey = (EditText) findViewById(R.id.et_key);
        etTotal = (EditText) findViewById(R.id.et_total);

        init();
    }

    private void init() {
        etId.setText(StorageUtil.getID());
        etKey.setText(StorageUtil.getKey());
        etTotal.setText(String.format("%d", StorageUtil.getTotal()));
    }

    private void save() {
        StorageUtil.setID(etId.getText().toString());
        StorageUtil.setKey(etKey.getText().toString());
        StorageUtil.setTotal(Integer.parseInt(etTotal.getText().toString()));
        ToastUtil.show(this, "Config saved", ToastUtil.SHORT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_save) {
            save();
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
