
package com.example.pokemonsquad;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("count")
    private Integer count;

    @SerializedName("next")
    private String next;

    @SerializedName("previous")
    private Object previous;

    @SerializedName("pokemonData")
    private List<PokemonData> pokemonData = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<PokemonData> getPokemonData() {
        return pokemonData;
    }

    public void setPokemonData(List<PokemonData> pokemonData) {
        this.pokemonData = pokemonData;
    }

}
