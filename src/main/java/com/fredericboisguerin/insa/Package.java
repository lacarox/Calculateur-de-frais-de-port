package com.fredericboisguerin.insa;

import java.math.BigDecimal;
import java.math.MathContext;
public abstract class Package {
    double height;
    double width;
    double depth;
    double weight;


    public Package(double height, double width, double depth, double weight) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }

    public abstract BigDecimal calculateLocalShippingCost();

    public static void main(String[] args){

        PackageFactory packFact = new PackageFactory();
        Package p1 = packFact.createPackage(191,123,18,2.354);
        Package p2 = packFact.createPackage(253,215,164,1.565);
        Package p3 = packFact.createPackage(653,133,271,2.132);
        Package p4 = packFact.createPackage(653,331,271,3.650);

        ShippingCostsCalculator calc = new ShippingCostsCalculator();
        System.out.println("p1 "+p1.getClass()+" (To FR) : "+calc.calculateShippingCost(p1,Destination.FR));
        System.out.println("p1 "+p1.getClass()+" (To MC) : "+calc.calculateShippingCost(p1,Destination.MC));
        System.out.println("p1 "+p1.getClass()+" (To DOMTOM) : "+calc.calculateShippingCost(p1,Destination.DOMTOM));
        System.out.println("p4 "+p4.getClass()+" (To FR) : "+calc.calculateShippingCost(p4,Destination.FR));
        System.out.println("p4 "+p4.getClass()+" (To MC) : "+calc.calculateShippingCost(p4,Destination.MC));
        System.out.println("p4 "+p4.getClass()+" (To DOMTOM) : "+calc.calculateShippingCost(p4,Destination.DOMTOM));
    }
}/*
public class Package {




    public BigDecimal calculateLocalShippingCost(){

        if(height<229 && width<162 && depth<25){
            return new BigDecimal(12).round(new MathContext(4));
        }else if(weight<=1.8){
            return new BigDecimal(2.86+17.59*weight).round(new MathContext(4));
        }else{

            return new BigDecimal((Math.max(21.62*weight,((height/100)*(width/100)*(depth/100))*1.43))).round(new MathContext(4));
        }

    }
    public static void main(String[] args){
        Package p1 = new Package(191,123,18,2.354);
        Package p2 = new Package(253,215,164,1.565);
        Package p3 = new Package(653,133,271,2.132);
        Package p4 = new Package(653,331,271,3.650);

        ShippingCostsCalculator calc = new ShippingCostsCalculator();
        System.out.println(calc.calculateShippingCost(p1,Destination.MC));
    }
}*/