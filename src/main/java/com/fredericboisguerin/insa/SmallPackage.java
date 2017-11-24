package com.fredericboisguerin.insa;

import java.math.BigDecimal;
import java.math.MathContext;

public class SmallPackage extends Package{

    public SmallPackage(double height, double width, double depth, double weight) {
        super(height, width, depth, weight);
    }

    public BigDecimal calculateLocalShippingCost() {
        return new BigDecimal(12).round(new MathContext(4));
    }
}
