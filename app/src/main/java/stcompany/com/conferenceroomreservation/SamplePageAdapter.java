package stcompany.com.conferenceroomreservation;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Objects;

/**
 * Created by takeshi on 16/01/26.
 */
public class SamplePageAdapter extends PagerAdapter{

    private static final int PAGA_COUNT = 3;
    private Context context;

    public SamplePageAdapter(Context context)
    {
        super();
        this.context = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        //TextViewの生成
        TextView textView = new TextView(context);
        textView.setText("Position :" + position);
        container.addView(textView);

        return textView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {

        // objectがinstantiateItemの返却値つまりtextView
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return PAGA_COUNT;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (TextView)object;
    }
}
