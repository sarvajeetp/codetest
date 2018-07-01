package com.code.test.Atrributes;

public enum COLORS {
    GREY("#808080"),
    ORANGE("#FFA500");

    private String colorCode;

    COLORS(String colorCode){
        this.colorCode = colorCode;
    }
}
