package com.fredericboisguerin.insa;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigPackage extends Package{
    public BigPackage(double height, double width, double depth, double weight) {
        super(height, width, depth, weight);
    }

    public BigDecimal calculateLocalShippingCost() {
        return new BigDecimal((Math.max(21.62*weight,((height/100)*(width/100)*(depth/100))*1.43))).round(new MathContext(4));
    }
}
