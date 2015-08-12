
package app.akitaxi_usuario.julio.my_tabhost;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pc on 11/08/2015.
 */
public class HistoryPageAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT= 3;
    Context context;

    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    public HistoryPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }



    @Override
    public Fragment getItem(int position) {


        Fragment fragment= null;

        if (position==0){
            fragment  = new Fragment_January();
        }
        if (position==1) {
            fragment = new Fragment_February();
        }
        if (position==2){
            fragment = new Fragment_March();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}
