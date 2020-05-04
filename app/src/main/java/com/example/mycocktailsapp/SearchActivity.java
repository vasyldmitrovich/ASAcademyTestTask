package com.example.mycocktailsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycocktailsapp.adapter.RecyclerAdapter;
import com.example.mycocktailsapp.api.NetworkService;
import com.example.mycocktailsapp.model.Drink;
import com.example.mycocktailsapp.model.DrinkList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends AppCompatActivity {

    List<Drink> drinkList;
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        drinkList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerAdapter = new RecyclerAdapter(getApplicationContext(), drinkList);
        recyclerView.setAdapter(recyclerAdapter);


        Call<DrinkList> call = NetworkService.getInstance().getJSONApi().getDrinkList("margarita");
        call.enqueue(new Callback<DrinkList>() {
            @Override
            public void onResponse(Call<DrinkList> call, Response<DrinkList> response) {
                if (response.isSuccessful()) {

                    DrinkList drinkListTemp = response.body();
                    /*Temp*/
                    List<Drink> drinks = drinkListTemp.getDrinks();
                    for (Drink d: drinks
                    ) {
                        System.out.println("This is DRINK: "+d.getStrDrink()+"\n");
                    }
                    drinkList = drinkListTemp.getDrinks();
                    recyclerAdapter.setDrinkList(drinkList);
                }
                else {
                    System.out.println("Response is bad: "+response.code());
                }
            }
            @Override
            public void onFailure(Call<DrinkList> call, Throwable t) {
                System.out.println("Sorry gay error. "+t.toString());
            }
        });

/*

        //This code work, he was before i start doing RecyclerView
        final TextView textView = findViewById(R.id.textViewSearch);
        TextView textView1 = findViewById(R.id.textViewName);
        ImageView imageView = (ImageView)findViewById(R.id.imageID);

        NetworkService.getInstance()
                .getJSONApi()
                .getDrinkList("margarita")
                .enqueue(new Callback<DrinkList>() {
                    @Override
                    public void onResponse(Call<DrinkList> call, Response<DrinkList> response) {
                        if (response.isSuccessful()) {
                            System.out.println("Response is successful: "+ response.body());
                            DrinkList drinkList = response.body();
                            List<Drink> drinks = drinkList.getDrinks();
                            ArrayList<String> arrayList = new ArrayList<>();
                            for (Drink drink: drinks
                                 ) {
                                System.out.println("This is message: "+drink.toString()+"\n");
                                textView.append(" "+drink.getStrDrink()+"\n");
                                textView1.append(" "+drink.getStrDrink()+"\n");
                                arrayList.add(drink.getStrDrink());
                            }
                            Picasso.get().load(
                                    "https://www.thecocktaildb.com/images/media/drink/wpxpvu1439905379.jpg")
                                    .into(imageView);
                        }
                        else {
                            System.out.println("Response is bad: "+response.code());
                        }
                    }
                    @Override
                    public void onFailure(Call<DrinkList> call, Throwable t) {
                        textView.append(" Error sorry gay");
                        t.printStackTrace();
                    }
                });
*/

    }

}
