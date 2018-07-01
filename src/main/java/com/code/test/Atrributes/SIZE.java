package com.code.test.Atrributes;

public enum SIZE {
    LARGE(5),
    SMALL(1);

    private int lengthInFt;

    SIZE(int lengthInFt){
        this.lengthInFt = lengthInFt;
    }
}
