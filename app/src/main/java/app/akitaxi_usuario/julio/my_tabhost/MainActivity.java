package app.akitaxi_usuario.julio.my_tabhost;


import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity {


    TabLayout tabLayout;
    ViewPager viewPager;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new HistoryPageAdapter(getSupportFragmentManager(),MainActivity.this));
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
