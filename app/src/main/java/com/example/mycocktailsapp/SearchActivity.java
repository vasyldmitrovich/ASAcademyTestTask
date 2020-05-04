package com.example.mycocktailsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mycocktailsapp.api.NetworkService;
import com.example.mycocktailsapp.model.Drink;
import com.example.mycocktailsapp.model.DrinkList;

import java.util.List;

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
                .getDrinkList("margarita")
                .enqueue(new Callback<DrinkList>() {
                    @Override
                    public void onResponse(Call<DrinkList> call, Response<DrinkList> response) {
                        if (response.isSuccessful()) {
                            System.out.println("Response is successful: "+ response.body());//TODO Delete this line
                            DrinkList drinkList = response.body();
                            List<Drink> drinks = drinkList.getDrinks();
                            for (Drink drink: drinks
                                 ) {
                                System.out.println("This is message: "+drink.toString()+"\n");//TODO Delete this line
                                textView.append(" "+drink.getStrDrink()+"\n");
                            }
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
    }

}
