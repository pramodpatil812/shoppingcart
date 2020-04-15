package com.cdkglobal.customers;

public class Slab {
    private double lowerBound;
    private double upperBound;
    private double discount;

    public Slab(double lowerBound, double upperBound, double discount) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.discount = discount;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public double getDiscount() {
        return discount;
    }

}
