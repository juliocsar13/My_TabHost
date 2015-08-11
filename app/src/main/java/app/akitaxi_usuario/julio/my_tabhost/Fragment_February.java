package app.akitaxi_usuario.julio.my_tabhost;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_February extends Fragment {

    View view;
    ListView lvFebruary;
    HistoryAdapter lvAdapter;
    public Fragment_February() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_blank2, container, false);
        lvFebruary = (ListView) view.findViewById(R.id.lvFebruary);
        /*Entry entry = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";

        Entry entry1 = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";

        Entry entry2 = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";

        Entry entry3 = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";

        Entry entry4 = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";

        Entry entry5 = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";

        ArrayList<Entry> history = new ArrayList<Entry>();

        history.add(entry);
        history.add(entry1);
        history.add(entry2);
        history.add(entry3);
        history.add(entry4);
        history.add(entry5);

        lvAdapter.setData(history);
        lvFebruary.setAdapter(lvAdapter);*/
        return view;
    }


}
