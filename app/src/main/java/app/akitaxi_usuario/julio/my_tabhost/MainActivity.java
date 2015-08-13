package app.akitaxi_usuario.julio.my_tabhost;


import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends FragmentActivity {


    TabLayout tabLayout;
    ViewPager viewPager;
    HistoryAdapter lvAdapter;
    ListView lvPrueba;

    ArrayList<Entry> history = new ArrayList<Entry>();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new HistoryPageAdapter(getSupportFragmentManager(),MainActivity.this));
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
*/

        lvPrueba = (ListView) findViewById(R.id.lvprueba);

        Entry entry = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";
        entry.name = "eeeeee";

        lvAdapter = new HistoryAdapter();
        history.add(entry);
        lvAdapter.setData(history);
        lvPrueba.setAdapter(lvAdapter);

    }
}
