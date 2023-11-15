package com.pluralsight.finance;

import java.util.List;

public class Portfolio {
    protected String name;
    protected String owner;
    protected List<IValuable> asset;

    public Portfolio(String name, String owner, List<IValuable> asset) {
        this.name = name;
        this.owner = owner;
        this.asset = asset;
    }

    public void add(IValuable asset) {
        this.asset.add(asset);
    }

    public double getValue() {
        double acc = 0;

        for (IValuable valuable : asset) {
            acc += valuable.getValue();
        }
        return acc;
    }

    public IValuable getMostValuable() {
        IValuable valuable = asset.get(0);

        for (int i = 1; i < asset.size(); i++) {
            if (valuable.getValue()>asset.get(i).getValue()) {
                valuable = asset.get(i);
            }
        }
        return valuable;
    }

    public IValuable getLeastValuable() {
        IValuable valuable = asset.get(0);

        for (int i = 1; i < asset.size(); i++) {
            if (valuable.getValue()<asset.get(i).getValue()) {
                valuable = asset.get(i);
            }
        }
        return valuable;
    }
}
