package com.example.simplelistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    /*
    * First Step - Creating List View (Adapter View) XML
    *
    * Second Step - Data Source
    * */

    ListView listView;

    String[] worldCup22 = {
            "Germany",
            "Spain",
            "Brazil",
            "England",
            "USA",
            "Qatar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Step 3 - Adapter Creation

        /*
        * parameters to be passed are :
        * 1 : context = this,
        * 2 : layout = (can be custom or android inbuilt),
        *      "android.R.layout.simple_list_item_1"  <- inbuilt layout
        * 3 : data source = array or sql
        *
        * */

        /*
         * parameters to be passed are : Custom layout
         * 1 : context = this,
         * 2 : layout = (can be custom or android inbuilt),
         *      "R.layout.my_list_item"  <- custom layout
         * 3 : view id
         *      "R.id.textView"  <- TextView id
         * 4 : data source = array or sql
         *
         * */

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                R.layout.my_list_item,
                R.id.textView,
                worldCup22
        );

        // setting the listview with adapter
        listView.setAdapter(adapter);

    }
}