package app.akitaxi_usuario.julio.my_tabhost;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;



/**
 * Created by Julio on 25/07/2015.
 */

public class HistoryAdapter extends BaseAdapter {

    private ArrayList<Entry> history;

    ViewHolder holder;
    Context ctx;
    public HistoryAdapter (Context context){
        super();
        ctx = context;
    }

    public void setData(ArrayList<Entry> _history){
        history = _history;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view  == null) {
            LayoutInflater mLayoutInflanter = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = mLayoutInflanter.inflate(R.layout.listview_history, null);
            holder = new ViewHolder();

            holder.txtListName          = (TextView) view.findViewById(R.id.txtListName);
            holder.txtListAutoPlate     = (TextView) view.findViewById(R.id.txtListPhone);
            holder.txtListPhone         = (TextView) view.findViewById(R.id.txtListPhone);
            holder.txtListCompany       = (TextView) view.findViewById(R.id.txtListCompany);
            holder.txtListAddress       = (TextView) view.findViewById(R.id.txtListAddress);

            view.setTag(holder);
        }else
            holder = (ViewHolder) view.getTag();


        holder.txtListName.setText((history.get(position).getName()));
        holder.txtListPhone.setText((history.get(position).getPhone()));
        holder.txtListAutoPlate.setText((history.get(position).getAutoplate()));
        holder.txtListCompany.setText((history.get(position).getCompany()));
        holder.txtListAddress.setText((history.get(position).getAddress()));

        return view;

    }
    private class ViewHolder{
             TextView  txtListName;
             TextView  txtListAutoPlate;
             TextView  txtListPhone;
             TextView  txtListAddress;
             TextView  txtListCompany;
        }
    @Override
    public int getCount() {
        return history.size();
    }

    @Override
    public Object getItem(int position) {
        return history.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}