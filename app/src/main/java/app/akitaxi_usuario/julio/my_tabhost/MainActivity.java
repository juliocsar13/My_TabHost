package app.akitaxi_usuario.julio.my_tabhost;


import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new HistoryPageAdapter(getSupportFragmentManager(),MainActivity.this));
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
    public void setToolbar(){

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Poner ícono del drawer toggle
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_launcher);
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.layout_logo_bar);
            //actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
