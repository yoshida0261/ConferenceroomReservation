package stcompany.com.conferenceroomreservation;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Date;
import java.util.Calendar;

public class MainActivity extends ActionBarActivity {

    private TimePickerDialog.OnTimeSetListener varTimeSetListener;

    private Date date;
    private String position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // エディットテキストのインスタンスを取得
        final EditText editText = (EditText) findViewById(R.id.editText2);

        varTimeSetListener
                = new TimePickerDialog.OnTimeSetListener() {
            // 時刻設定ダイアログの[OK]ボタンがクリックされたときの処理
            public void onTimeSet(
                    TimePicker view, int hourOfDay, int minute) {
                // データをエディットテキストに書き込む
                editText.setText(hourOfDay + ":" + minute);
            }
        };
//
        ((Button) findViewById(R.id.timeButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 現在時刻を取得
                Calendar calendar = Calendar.getInstance();
                // 時刻設定ダイアログのインスタンスを生成
                TimePickerDialog timeDialog = new TimePickerDialog(
                        MainActivity.this,
                        varTimeSetListener,
                        calendar.get(Calendar.HOUR_OF_DAY),
                        calendar.get(Calendar.MINUTE),
                        false);
                // 時刻設定ダイアログを表示
                timeDialog.show();
            }
        });

        //submit pushed
        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "テスト", Toast.LENGTH_LONG).show();
            }
        });


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
