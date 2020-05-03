package com.example.mycocktailsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mycocktailsapp.api.NetworkService;
import com.example.mycocktailsapp.model.Drink;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final TextView textView = findViewById(R.id.textViewSearch);

        NetworkService.getInstance()
                .getJSONApi()
                .getDrinkByName("margarita")
                .enqueue(new Callback<Drink>() {
                    @Override
                    public void onResponse(@NonNull Call<Drink> call,@NonNull Response<Drink> response) {
                        Drink drink = response.body();

                        textView.append(" "+drink.getStrDrink()+"\n");

                    }

                    @Override
                    public void onFailure(@NonNull Call<Drink> call,@NonNull Throwable t) {
                        textView.append(" Error sorry gay");
                        t.printStackTrace();
                    }
                });
    }
}
