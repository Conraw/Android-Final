package com.example.listtest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.*;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//Test Classes for now will be added into a different file once working as intended.
 class Pad_Thai{
     public
     String name = "Pad Thai";
     boolean gluten = true;
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

//Testing Function to test if an object of a class has that allergen
//public class hasGluten {
 //    public boolean yes(boolean []arr) {
  //       for (int i = 0; i < arr.length; i++) {


 //            if (arr[i] == true) {

 //            }

 //        }
 //        return true;
  //   }

//}

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private ArrayAdapter adapter;
    private ArrayAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.theList);
        EditText theFilter = (EditText) findViewById(R.id.searchFilter);
        Log.d(TAG, "onCreate: Started.");

        //Creating Objects of the Specified classes
        Pad_Thai obj = new Pad_Thai();
        Beef_Broc obj2= new Beef_Broc();
        Fried_Rice obj3= new Fried_Rice();

        //array of an object of classes
        ArrayList<String> food = new ArrayList<>();
        //testing array
        ArrayList<String> names = new ArrayList<>();

        food.add(obj.name);
        food.add(obj2.name);
        food.add(obj3.name);

        names.add("Orange Chicken");
        names.add("Pad Thai");
        names.add("Fried Rice");
        names.add("Beef and Broc");
        names.add("Special Tempora");


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, food);
        adapter2 =  new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);

        list.setAdapter(adapter);

       theFilter.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               (MainActivity.this).adapter.getFilter().filter(charSequence);

              // int textlength = charSequence.length();
              // ArrayList<food> tempArrayList = new ArrayList<food>();
              // for (food c : tempArrayList) {
             //      if (c.hasGluten() == false) {
              //         tempArrayList.add(c);
               //    }
              // }
               //mAdapter = new food(activity, tempArrayList);
               //lv.setAdapter(madapter);


               String gluten = "gluten";

               if (charSequence == gluten)
               {
                   (MainActivity.this).adapter2.getFilter().filter(charSequence);
               }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });
    }
}
