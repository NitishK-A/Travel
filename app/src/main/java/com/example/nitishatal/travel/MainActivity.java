package com.example.nitishatal.travel;


import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {

    ListView list;
    String[] itemname ={
            "Trip To Kasol",
            "Hangout",
            "Road Trip",
            "Ladakh Trip"



    };
    String[] loc ={
            "New Delhi",
            "Gurgaon",
            "Noida",
            "New Delhi",




    };
    String[] date ={
            "Tue,25 Sep at 10:00 am",
            "Wed, 5 Oct at 2:00 pm",
            "Tue,25 Sep at 10:00 am",
            "Wed, 5 Oct at 2:00 pm"



    };




    Integer[] imgid={
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p5,
            R.drawable.p6





    };
    String[] bankNames={"Location","New Delhi","Goa","Mumbai","Himachal"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

//Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bankNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        ListAdapter adapter=new ListAdapter(this, itemname, date,loc,imgid);
        list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);





        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), bankNames[i], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}


