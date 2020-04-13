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

//Kitchen Food
class Food {
    public String name;
    public boolean gluten;
    public boolean shellfish;
    public Food(String name, boolean gluten, boolean shellfish) {
        super();
        this.name = name;
        this.gluten = gluten;
        this.shellfish = shellfish;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getGluten() {
        return gluten;
    }
    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }
    public boolean getShellfish() {
        return shellfish;
    }
    public void setShellfish(boolean shellfish) {
        this.shellfish = shellfish;
    }
}

class Akaushi {
    public
    String name = "Akaushi Beef";
    boolean gluten = true;
    boolean shellfish = false;
}
class Beef_Broc {
    public
    String name = "Beef & Broccoli";
    boolean gluten = false;
    boolean shellfish = false;
}
class Fried_Rice {
    public
    String name = "Fried Rice";
    boolean gluten = false;
    boolean shellfish = false;
}
class Korean_BBQ {
    public
    String name = "Korean BBQ Beef Bowl";
    boolean gluten = true;
    boolean shellfish = false;
}
class Orange_Chicken {
    public
    String name = "Orange Chicken";
    boolean gluten = true;
    boolean shellfish = true;
}
class Pad_Thai {
    public
    String name = "Pad Thai";
    boolean gluten = false;
    boolean shellfish = false;
}

//Sushi List Start
class Cali {
    public
    String name = "California Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Crossroads {
    public
    String name = "Crossroads Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Eel {
    public
    String name = "Eel Roll";
    boolean gluten = true;
    boolean shellfish = false;
}
class Jalapeno {
    public
    String name = "Jalapeno Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Mango_Tango {
    public
    String name = "Mango Tango Roll";
    boolean gluten = false;
    boolean shellfish = true;
}
class Mega_Roll {
    public
    String name = "Mega Roll";
    boolean gluten = false;
    boolean shellfish = false;
}
class Mr_Dandy {
    public
    String name = "Mr Dandy Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Mr_Lobster {
    public
    String name = "Mr Lobster Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Nara {
    public
    String name = "Nara Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Philly {
    public
    String name = "Philadelphia Roll";
    boolean gluten = false;
    boolean shellfish = false;
}
class Rainbow {
    public
    String name = "Rainbow Roll";
    boolean gluten = false;
    boolean shellfish = false;
}
class Sexy_Mama {
    public
    String name = "Sexy Mama Roll";
    boolean gluten = true;
    boolean shellfish = false;
}
class Shrimp_Temp {
    public
    String name = "Shrimp Tempura Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Spicy_Tuna {
    public
    String name = "Spicy Tuna Roll";
    boolean gluten = false;
    boolean shellfish = false;
}
class Spider {
    public
    String name = "Spider Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Sunrise {
    public
    String name = "Sunrise Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Vegas {
    public
    String name = "Vegas Roll";
    boolean gluten = true;
    boolean shellfish = true;
}
class Vegetable {
    public
    String name = "Vegetable Roll";
    boolean gluten = true;
    boolean shellfish = false;
}
class Yin_Yang {
    public
    String name = "Yin and Yang Roll";
    boolean gluten = true;
    boolean shellfish = true;
}


public class MainActivity extends AppCompatActivity {

    private ArrayList<Food> mFoodArrayList = new ArrayList<Food>();


    private static final String TAG = "MainActivity";
    private ArrayAdapter KitchenAdapter;
    private ArrayAdapter SushiAdapter;
    private ArrayAdapter tempadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView list = findViewById(R.id.KitchenList);
        //final ListView list2 = findViewById(R.id.SushiList);

        EditText theFilter = findViewById(R.id.searchFilter);
        Log.d(TAG, "onCreate: Started.");

        //Creating Objects of the Specified classes
        Akaushi kitchen1 = new Akaushi();
        Beef_Broc kitchen2 = new Beef_Broc();
        Fried_Rice kitchen3 = new Fried_Rice();
        Korean_BBQ kitchen4 = new Korean_BBQ();
        Orange_Chicken kitchen5 = new Orange_Chicken();
        Pad_Thai kitchen6 = new Pad_Thai();

        Cali sushi1 = new Cali();
        Crossroads sushi2 = new Crossroads();
        Eel sushi3 = new Eel();
        Jalapeno sushi4 = new Jalapeno();
        Mango_Tango sushi5 = new Mango_Tango();
        Mega_Roll sushi6 = new Mega_Roll();
        Mr_Dandy sushi7 = new Mr_Dandy();
        Mr_Lobster sushi8 = new Mr_Lobster();
        Nara sushi9 = new Nara();
        Philly sushi10 = new Philly();
        Rainbow sushi11 = new Rainbow();
        Sexy_Mama sushi12 = new Sexy_Mama();
        Shrimp_Temp sushi13 = new Shrimp_Temp();
        Spicy_Tuna sushi14 = new Spicy_Tuna();
        Spider sushi15 = new Spider();
        Sunrise sushi16 = new Sunrise();
        Vegas sushi17 = new Vegas();
        Vegetable sushi18= new Vegetable();
        Yin_Yang sushi19 = new Yin_Yang();



        mFoodArrayList.add(new Food("a", false, false));
        mFoodArrayList.add(new Food("b", false, false));
        mFoodArrayList.add(new Food("c", false, false));
        mFoodArrayList.add(new Food("d", false, false));
        mFoodArrayList.add(new Food("e", false, false));
        mFoodArrayList.add(new Food("f", false, false));
        mFoodArrayList.add(new Food("g", false, false));
        mFoodArrayList.add(new Food("h", false, false));
        mFoodArrayList.add(new Food("i", false, false));




        //array of an object of classes
        final ArrayList<String> KitchenFood = new ArrayList<>();
        //final ArrayList<String> SushiFood = new ArrayList<>();

        KitchenFood.add(kitchen1.name);
        KitchenFood.add(kitchen2.name);
        KitchenFood.add(kitchen3.name);
        KitchenFood.add(kitchen4.name);
        KitchenFood.add(kitchen5.name);
        KitchenFood.add(kitchen6.name);


        KitchenFood.add(sushi1.name);
        KitchenFood.add(sushi2.name);
        KitchenFood.add(sushi3.name);
        KitchenFood.add(sushi4.name);
        KitchenFood.add(sushi5.name);
        KitchenFood.add(sushi6.name);
        KitchenFood.add(sushi7.name);
        KitchenFood.add(sushi8.name);
        KitchenFood.add(sushi9.name);
        KitchenFood.add(sushi10.name);
        KitchenFood.add(sushi11.name);
        KitchenFood.add(sushi12.name);
        KitchenFood.add(sushi13.name);
        KitchenFood.add(sushi14.name);
        KitchenFood.add(sushi15.name);
        KitchenFood.add(sushi16.name);
        KitchenFood.add(sushi17.name);
        KitchenFood.add(sushi18.name);
        KitchenFood.add(sushi19.name);



        KitchenAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mFoodArrayList);

        list.setAdapter(KitchenAdapter);


       theFilter.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               //(MainActivity.this).KitchenAdapter.getFilter().filter(charSequence);
               KitchenAdapter.getFilter().filter(charSequence.toString());
               //(MainActivity.this).SushiAdapter.getFilter().filter(charSequence);

              // if (charSequence == "gluten") {

                   //ArrayList<String> tempArrayList = new ArrayList<>();
                  // for (int t = 0; t < tempArrayList.size(); t++) {

                       //KitchenFood abc = KitchenFood.get(t);


                      // if (abc.shellfish == false) {
                       //    tempArrayList.add(KitchenFood.get(t));
                      // }
                  // }

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

             //  }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });
    }
}
