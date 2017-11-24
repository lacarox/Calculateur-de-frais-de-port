package com.fredericboisguerin.insa;

import java.math.BigDecimal;
import java.math.MathContext;

public class MediumPackage extends Package {
    public MediumPackage(double height, double width, double depth, double weight) {
        super(height, width, depth, weight);
    }

    public BigDecimal calculateLocalShippingCost() {
        return new BigDecimal(2.86+17.59*weight).round(new MathContext(4));
    }
}
