package com.example.pokemonsquad;

import androidx.lifecycle.ViewModel;

import io.reactivex.Observable;

public abstract class BaseViewModel extends ViewModel {

    private final DataManager mDataManager;

    public BaseViewModel(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

}
