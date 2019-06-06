package com.example.pokemonsquad;

import android.content.Context;


import com.example.pokemonsquad.interfaces.ApplicationContext;
import com.example.pokemonsquad.interfaces.RandomUserApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @ApplicationContext
    @RandomUserApplicationScope
    @Provides
    public Context context(){ return context.getApplicationContext(); }
}
