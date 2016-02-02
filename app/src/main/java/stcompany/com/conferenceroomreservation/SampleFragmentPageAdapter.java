package stcompany.com.conferenceroomreservation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by takeshi on 16/02/03.
 */
public class SampleFragmentPageAdapter extends FragmentPagerAdapter {
    private static final int PAGE_COUNT = 5;

    public SampleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return SampleFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
