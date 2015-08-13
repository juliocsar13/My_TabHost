package app.akitaxi_usuario.julio.my_tabhost;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_January extends Fragment {

    ListView lvJanuary;
    View view;
    ListViewAdapter adapter;
    HistoryAdapter lvAdapter;
    Context context;
    ArrayList<Entry> history = new ArrayList<Entry>();


    public Fragment_January() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_blank, container, false);

        lvJanuary  = (ListView) view.findViewById(R.id.lvJanuary);

        Entry entry = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";
        entry.name = "eeeeee";

        history.add(entry);
        lvJanuary.setAdapter(lvAdapter);



        return view;
    }



}
