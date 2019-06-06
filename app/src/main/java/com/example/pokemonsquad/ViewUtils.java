package com.example.pokemonsquad;

public interface ViewUtils {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
