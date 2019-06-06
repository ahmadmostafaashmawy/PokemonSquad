package com.example.pokemonsquad;

import java.util.List;

import io.reactivex.Observable;

public interface DataManager {

    Observable<List<Response>> getPokemons();

}
