package app.akitaxi_usuario.julio.my_tabhost;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by Julio on 10/08/2015.
 */
public class PagerAdapterLayout extends PagerAdapter {





    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
