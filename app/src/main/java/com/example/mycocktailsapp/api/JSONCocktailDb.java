package com.example.mycocktailsapp.api;

import com.example.mycocktailsapp.model.DrinkList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JSONCocktailDb {

    @GET("search.php")
    Call<DrinkList> getDrinkList (@Query("s") String string);
}
