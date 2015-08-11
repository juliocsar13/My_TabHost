package app.akitaxi_usuario.julio.my_tabhost;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Julio on 09/08/2015.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGER_COUNT= 4;
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab_January  tab_january = new Tab_January();
                return tab_january;
            case 1:
                Tab_February tab_february = new Tab_February();
                return tab_february;
            case 2:
                Tab_March tab_march = new Tab_March();
                return tab_march;
            case 3:
                Tab_April tab_april = new Tab_April();
                return tab_april;

            default:
                Tab_January tab_january1 = new Tab_January();
                return tab_january1;
        }
    }

    @Override
    public int getCount() {
        return PAGER_COUNT;
    }
}
