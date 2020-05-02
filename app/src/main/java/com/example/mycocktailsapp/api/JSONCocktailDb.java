package com.example.mycocktailsapp.api;

import com.example.mycocktailsapp.model.Drink;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JSONCocktailDb {

    @GET("/api/json/v1/1/search.php?s={name}")
    public Call<Drink> getDrinkByName (@Path("name") String name);
}
