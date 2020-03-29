package com.example.listtest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;

import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.ListView;


//Test Classes for now will be added into a different file once working as intended.
 class Pad_Thai{
     public
     String name = "Pad Thai";
     boolean gluten = false;
     boolean shellfish = true;

        }
        class Fried_Rice{
     public
     String name = "Fried Rice";
            boolean gluten = true;
            boolean shellfish = true;
        }
class Beef_Broc{
    public
    String name = "Beef & Broc";
    boolean gluten = true;
    boolean shellfish = true;
}
class Mega_Roll {
    public
    String name = "Mega Roll";
    boolean gluten = false;
    boolean shellfish = true;
}
class Mango_Tango {
     public
     String name = "Mango Tango";
     boolean gluten = true;
     boolean shellfish = true;
}
class Crossroads {
     public
     String name = "Crossroads Roll";
     boolean gluten = true;
     boolean shellfish = true;
}

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private ArrayAdapter KitchenAdapter;
    private ArrayAdapter SushiAdapter;
    private ArrayAdapter tempadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView list = (ListView) findViewById(R.id.KitchenList);
        final ListView list2 = (ListView) findViewById(R.id.SushiList);
        EditText theFilter = (EditText) findViewById(R.id.searchFilter);
        Log.d(TAG, "onCreate: Started.");

        //Creating Objects of the Specified classes
        Pad_Thai kitchen1 = new Pad_Thai();
        Beef_Broc kitchen2 = new Beef_Broc();
        Fried_Rice kitchen3 = new Fried_Rice();

        Mega_Roll sushi1 = new Mega_Roll();
        Mango_Tango sushi2 = new Mango_Tango();
        Crossroads sushi3 = new Crossroads();

        //array of an object of classes
        final ArrayList<String> KitchenFood = new ArrayList<>();
        final ArrayList<String> SushiFood = new ArrayList<>();

        KitchenFood.add(kitchen1.name);
        KitchenFood.add(kitchen2.name);
        KitchenFood.add(kitchen3.name);

        SushiFood.add(sushi1.name);
        SushiFood.add(sushi2.name);
        SushiFood.add(sushi3.name);


        KitchenAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, KitchenFood);
        SushiAdapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1, SushiFood);


        list.setAdapter(KitchenAdapter);
        list2.setAdapter(SushiAdapter);

       theFilter.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               (MainActivity.this).KitchenAdapter.getFilter().filter(charSequence);
               (MainActivity.this).SushiAdapter.getFilter().filter(charSequence);


               //if (charSequence == "gluten") {

                   //ArrayList<String> tempArrayList = new ArrayList<String>();
                   //for (int t  = 0; t < tempArrayList.size() ; t++) {

                   //    String abc = KitchenFood.get(t);

                    //   if (KitchenFood[t].gluten == false) {
                   //        tempArrayList.add(KitchenFood.get(t));
                   //    }
                   //}

                  // tempadapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tempArrayList);
                  // list.setAdapter(tempadapter);
               //}

              // ArrayList<String> tempArrayList = new ArrayList<String>();
              // for (int t  = 0; t < tempArrayList.size() ; t++) {
               //   if ([t].gluten() == false) {
              //         tempArrayList.add(c);
               //    }
               //}
               //mAdapter = new food(activity, tempArrayList);
               //lv.setAdapter(madapter);

           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });
    }
}
