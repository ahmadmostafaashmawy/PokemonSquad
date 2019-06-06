package com.example.pokemonsquad;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class PokemonListViewModel extends BaseViewModel {

    private final MutableLiveData<List<Response>> pokemonData;

    public PokemonListViewModel(DataManager dataManager) {
        super(dataManager);
        pokemonData = new MutableLiveData<>();
    }

    public LiveData<List<Response>> getPokemonData() {
        return pokemonData;
    }

    public void getPokemons() {

    }

}
