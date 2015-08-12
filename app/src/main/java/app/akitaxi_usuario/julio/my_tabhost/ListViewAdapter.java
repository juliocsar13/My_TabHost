package app.akitaxi_usuario.julio.my_tabhost;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pc on 11/08/2015.
 */
public class ListViewAdapter extends BaseAdapter {


    Context context;
    private ArrayList<Entry> notification = new ArrayList<Entry>();
    LayoutInflater inflater;

    public ListViewAdapter(Context context, ArrayList<Entry> notification ) {
        this.context = context;
        this.notification= notification;

    }
    @Override
    public int getCount() {
        return notification.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {


        TextView txtname;
        TextView txtphone;
        TextView txtaddress;
        TextView txtcompany;
        TextView txtautoplate;

                inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.listview_history, viewGroup, false);

        txtname = (TextView) itemView.findViewById(R.id.txtListName);
        txtphone = (TextView) itemView.findViewById(R.id.txtListPhone);
        txtaddress = (TextView) itemView.findViewById(R.id.txtListAddress);
        txtcompany = (TextView) itemView.findViewById(R.id.txtListCompany);
        txtautoplate = (TextView) itemView.findViewById(R.id.txtListAutoPlate);


        txtname.setText(notification.get(position).getName());
        txtphone.setText(notification.get(position).getPhone());
        txtaddress.setText(notification.get(position).getAddress());
        txtcompany.setText(notification.get(position).getCompany());
        txtautoplate.setText(notification.get(position).getAutoplate());

        return itemView;
    }
}
