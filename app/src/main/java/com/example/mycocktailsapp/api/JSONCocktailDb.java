package com.example.mycocktailsapp.api;

import com.example.mycocktailsapp.model.Drink;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JSONCocktailDb {

    @GET("/api/json/v1/1/search.php")
    public Call<Drink> getDrinkByName (@Query("s") String name);
}
