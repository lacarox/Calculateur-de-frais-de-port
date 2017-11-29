package com.fredericboisguerin.insa;

import java.math.BigDecimal;
import java.math.MathContext;

public class ShippingCostsCalculator {

    public BigDecimal calculateShippingCost(Package p, Destination destination){
        switch (destination){
            case FR:
                return new BigDecimal(p.calculateLocalShippingCost().doubleValue()).round(new MathContext(4)).setScale(2);
            case MC:
                return new BigDecimal(p.calculateLocalShippingCost().doubleValue()*1.087).round(new MathContext(4)).setScale(2);
            case DOMTOM:
                return new BigDecimal(p.calculateLocalShippingCost().doubleValue()*1.054+1.26).round(new MathContext(4)).setScale(2);
            default:
                return null;
        }

        // Retourne les frais de port du package en fonction de la destination

    }

}