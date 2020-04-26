package com.example.listtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.versionedparcelable.NonParcelField;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import android.widget.EditText;
import android.widget.ListView;

//Base Class with getters and setters and initialized with each food added
class Food {
    public String name;
    public boolean gluten;
    public boolean shellfish;
    public boolean peanut;
    public boolean egg;

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
    public boolean getShellfish() {
        return shellfish;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }
    public void setShellfish(boolean shellfish) {
        this.shellfish = shellfish;
    }
}

class ListAdapter extends ArrayAdapter<Food> {
    private int resourceLayout;
    private Context mContext;

    public ListAdapter(Context context, int resource, List<Food> items) {
        super(context, resource, items);
        this.resourceLayout = resource;
        this.mContext = context;
    }
   // @Override
   // public View getView(int position, View convertView, ViewGroup parent) {

}

public class MainActivity extends AppCompatActivity {

    private ArrayList<Food> mFoodArrayList = new ArrayList<Food>();

    private static final String TAG = "MainActivity";
    private ArrayAdapter KitchenAdapter;
    private ArrayAdapter TempAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = findViewById(R.id.KitchenList);
        EditText theFilter = findViewById(R.id.searchFilter);
        Log.d(TAG, "onCreate: Started.");

        mFoodArrayList.add(new Food("Akaushi Beef", true, false));
        mFoodArrayList.add(new Food("Beef & Broccoli", false, false));
        mFoodArrayList.add(new Food("Fried Rice", false, false));
        mFoodArrayList.add(new Food("Korean BBQ Beef Bowl", true, false));
        mFoodArrayList.add(new Food("Orange Chicken", true, true));
        mFoodArrayList.add(new Food("Pad Thai", false, false));
        mFoodArrayList.add(new Food("California Roll", true, true));
        mFoodArrayList.add(new Food("Crossroads Roll", true, true));
        mFoodArrayList.add(new Food("Eel Roll", true, false));
        mFoodArrayList.add(new Food("Jalapeno Roll", true, true));
        mFoodArrayList.add(new Food("Mango Tango Roll", false, true));
        mFoodArrayList.add(new Food("Mega Roll", false, false));
        mFoodArrayList.add(new Food("Mr Dandy Roll", true, true));
        mFoodArrayList.add(new Food("Mr Lobster Roll", true, true));
        mFoodArrayList.add(new Food("Nara Roll", true, true));
        mFoodArrayList.add(new Food("Philadelphia Roll", false, false));
        mFoodArrayList.add(new Food("Rainbow Roll", false, false));
        mFoodArrayList.add(new Food("Sexy Mama Roll", true, false));
        mFoodArrayList.add(new Food("Shrimp Tempura Roll", true, true));
        mFoodArrayList.add(new Food("Spicy Tuna Roll", false, false));
        mFoodArrayList.add(new Food("Spider Roll", true, true));
        mFoodArrayList.add(new Food("Sunrise Roll", true, true));
        mFoodArrayList.add(new Food("Vegas Roll", true, true));
        mFoodArrayList.add(new Food("Vegetable Roll", true, false));
        mFoodArrayList.add(new Food("Yin and Yang Roll", true, true));

        ArrayList<String> tempList = new ArrayList<String>();

        //Make the ListView show the names of the food items as oppose to memory locations
        for (int i = 0; i <mFoodArrayList.size(); i++)
        {
            String KitchenFood = mFoodArrayList.get(i).name;
            tempList.add(KitchenFood);
        }
        KitchenAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tempList);
        list.setAdapter(KitchenAdapter);

       theFilter.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
               KitchenAdapter.getFilter().filter(charSequence.toString());

               if (count == 0)
               {
                   ArrayList<String> tempList = new ArrayList<String>();
                   for (int i = 0; i <mFoodArrayList.size(); i++)
                   {
                       String KitchenFood = mFoodArrayList.get(i).name;
                       tempList.add(KitchenFood);
                   }
                   KitchenAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, tempList);
                   list.setAdapter(KitchenAdapter);
               }

               ArrayList<String> glutenList = new ArrayList<String>();
               ArrayList<String> shellfishList = new ArrayList<String>();


               if (charSequence.toString().equals("gluten"))
               {
                  for (int j = 0; j < mFoodArrayList.size(); j ++)
                  {
                      boolean glutenStatus = mFoodArrayList.get(j).gluten;
                      String KitchenFood = mFoodArrayList.get(j).name;

                      if (!glutenStatus)
                      {
                          glutenList.add(KitchenFood);
                      }
                  }
                  TempAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, glutenList);
                  list.setAdapter(TempAdapter);
               }
               if (charSequence.toString().equals("shellfish"))
               {
                   for (int j = 0; j < mFoodArrayList.size(); j ++)
                   {
                       boolean shellfishStatus = mFoodArrayList.get(j).shellfish;
                       String KitchenFood = mFoodArrayList.get(j).name;

                       if (!shellfishStatus)
                       {
                           shellfishList.add(KitchenFood);
                       }
                   }
                   TempAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, shellfishList);

                   list.setAdapter(TempAdapter);
               }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });
    }
}
