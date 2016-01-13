package stcompany.com.conferenceroomreservation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView view = (ListView)findViewById(R.id.listView);
        //ArrayAdapter<String> array = new ArrayAdapter<String>
    }
}
