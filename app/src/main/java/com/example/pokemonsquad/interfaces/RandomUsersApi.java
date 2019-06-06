package com.example.pokemonsquad.interfaces;

import com.example.pokemonsquad.PokemonData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface RandomUsersApi {

    @GET("api")
    Call<PokemonData> getPokemons();
}