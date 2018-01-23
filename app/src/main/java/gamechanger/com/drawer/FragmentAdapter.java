package gamechanger.com.drawer;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nitin.gupta on 1/23/2018.
 */

class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position){
            case 0:
                return new RecentList();
            case 1:
                return new RecentList();
            case 2:
                return new ContactList();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            //
            //Your tab titles
            //
            case 0:return "Chat";
            case 1:return "Status";
            case 2: return "Call";
            default:return null;
        }
    }
}
