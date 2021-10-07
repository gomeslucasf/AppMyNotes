package com.example.appmynotes.model;

public enum Cores {
    Vermelho("#E2C541"),
    Azul("#182C59"),
    Amarelo("#E2C541");

    private String _hexadecimal;

    Cores(String hexadecimal)
    {
        this._hexadecimal = hexadecimal;
    }

    public String getHexadecimal(){
        return this._hexadecimal;
    }
}
