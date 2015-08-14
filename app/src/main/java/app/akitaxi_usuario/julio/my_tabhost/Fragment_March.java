package app.akitaxi_usuario.julio.my_tabhost;


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
public class Fragment_March extends Fragment {

    View view;
    ListView lvMarch;
    ArrayList<Entry> history = new ArrayList<Entry>();
    HistoryAdapter lvAdapter;


    public Fragment_March() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_blank3, container, false);

        lvMarch = (ListView) view.findViewById(R.id.lvMarch);

        Entry entry = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";
        entry.name = "eeeeee";

        lvAdapter = new HistoryAdapter(view.getContext());
        history.add(entry);
        lvAdapter.setData(history);
        lvMarch.setAdapter(lvAdapter);

    return view;
    }



}
