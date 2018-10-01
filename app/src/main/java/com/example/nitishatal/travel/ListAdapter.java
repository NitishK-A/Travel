package com.example.nitishatal.travel;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] locationstate;
    private final String[] date;
    private final Integer[] imgid;

    public ListAdapter(Activity context, String[] itemname, String[] locationstate,String[] date,Integer[] imgid) {
        super(context, R.layout.list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.locationstate=locationstate;
        this.date=date;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        @SuppressLint("ViewHolder") View rowView=inflater.inflate(R.layout.list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);
        TextView loctext=(TextView) rowView.findViewById(R.id.t2);
        // TextView datetext=(TextView) rowView.findViewById(R.id.t3);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText(date[position]);
        //datetext.setText(date[position]);
        loctext.setText(locationstate[position]);
        return rowView;

    };
}