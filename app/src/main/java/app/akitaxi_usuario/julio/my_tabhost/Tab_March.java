package app.akitaxi_usuario.julio.my_tabhost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Julio on 09/08/2015.
 */
public class Tab_March extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tab_march,container,false);
        return view;
    }
}
