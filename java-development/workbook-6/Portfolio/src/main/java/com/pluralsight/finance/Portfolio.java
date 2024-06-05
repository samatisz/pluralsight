package com.pluralsight.finance;

import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //need addAsset method
    //getMostValuable(){}
    //getLeastValuable(){}

//    public double getValue() {
//        return ;
    
}
