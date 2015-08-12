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
public class Fragment_February extends Fragment {

    View view;
    ListView lvFebruary;
    HistoryAdapter lvAdapter;
    ArrayList<Entry> history = new ArrayList<Entry>();

    ListViewAdapter adapter;
    public Fragment_February() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_blank2, container, false);
        Entry entry = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";
        entry.name = "eeeeee";

        history.add(entry);

        lvFebruary.setAdapter(lvAdapter);
        lvAdapter.setData(history);
        /*Entry entry = new Entry();
        entry.company = "aaaaa";
        entry.address = "bbbbb";
        entry.autoplate = "cccccc";
        entry.phone = "dddddd";
        entry.name = "eeeeee";


        history.add(entry);
        lvAdapter.setData(history);*/
        lvFebruary.setAdapter(lvAdapter);
        /*name = new String[] { "julio", "csa", "3", "4", "5" };

        address = new String[] { "China", "India", "United States",
                "Indonesia", "Brazil" };

        phone = new String[] { "1,354,040,000", "1,210,193,422",
                "315,761,000", "237,641,326", "193,946,886" };

        autoplate = new String[] { "1,354,040,000", "1,210,193,422",
                "315,761,000", "237,641,326", "193,946,886" };

        company = new String[] { "1,354,040,000", "1,210,193,422",
                "315,761,000", "237,641,326", "193,946,886" };

        lvFebruary = (ListView) view.findViewById(R.id.lvFebruary);

        adapter = new ListViewAdapter(getActivity(), name, phone, address, autoplate, company);
        lvFebruary.setAdapter(adapter);*/





        return view;
    }


}
