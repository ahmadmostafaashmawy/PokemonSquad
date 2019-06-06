package com.example.pokemonsquad.component;

import com.example.pokemonsquad.PicassoModule;
import com.example.pokemonsquad.RandomUsersModule;
import com.example.pokemonsquad.interfaces.RandomUserApplicationScope;
import com.example.pokemonsquad.interfaces.RandomUsersApi;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by Hari on 23/11/17.
 */
@RandomUserApplicationScope
@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {

    RandomUsersApi getRandomUserService();

    Picasso getPicasso();
}
