package com.ve.tecno.mvp1.models;

import com.ve.tecno.mvp1.MainActivity;

public class MainActivityModel implements MainActivity.Model {

    private MainActivity.Presenter presenter;
    private String data;

    public MainActivityModel(MainActivity.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void addName(String s) {
        data = s + " Texto adicional.";    // Al String que llega le agregamos un texto.
        presenter.showResult(data);
    }
}
