package stcompany.com.conferenceroomreservation;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends ActionBarActivity {

    private Activity mActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mActivity = this;

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test");

        ///一般的なlistViewの実装
        ListView view = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> array = new ArrayAdapter<String>(mActivity, android.R.layout.activity_list_item, arrayList);
        //array.add(arrayList);
        view.setAdapter(array);


    }
}
