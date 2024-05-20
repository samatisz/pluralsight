package com.pluralsight.finance;

public class FixedAsset implements iValuable {
    private String name;
    private double value;

    @Override
    public double getValue() {
        return 0;
    }

    public FixedAsset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
