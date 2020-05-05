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
    String addToLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Bundle arguments = getIntent().getExtras();
        addToLink = arguments.get("s").toString().toLowerCase();

        drinkList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerAdapter = new RecyclerAdapter(getApplicationContext(), drinkList);
        recyclerView.setAdapter(recyclerAdapter);

        Call<DrinkList> call = NetworkService.getInstance().getJSONApi().getDrinkList(addToLink);
        call.enqueue(new Callback<DrinkList>() {
            @Override
            public void onResponse(Call<DrinkList> call, Response<DrinkList> response) {
                if (response.isSuccessful()) {
                    DrinkList drinkListFromResponse = response.body();

                    drinkList = drinkListFromResponse.getDrinks();
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
    }
}
