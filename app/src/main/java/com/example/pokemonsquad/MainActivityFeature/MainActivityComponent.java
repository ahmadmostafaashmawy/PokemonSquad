package com.example.pokemonsquad.MainActivityFeature;

import com.example.pokemonsquad.MainActivity;
import com.example.pokemonsquad.component.RandomUserComponent;

import dagger.Component;

/**
 * Created by Hari on 20/12/17.
 */
@Component(modules = MainActivityModule.class, dependencies = RandomUserComponent.class)
@MainActivityScope
public interface MainActivityComponent {

    void injectMainActivity(MainActivity mainActivity);

}
