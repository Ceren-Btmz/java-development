package com.pluralsight.finance;

public abstract class FixedAsset implements IValuable {
    private String name;
    protected double value;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public abstract class getValue();


}
