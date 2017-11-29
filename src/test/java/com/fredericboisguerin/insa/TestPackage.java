package com.fredericboisguerin.insa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestPackage {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {191, 123, 18, 2.354d, "FR", "12.00"},

                {253, 215, 164, 1.565d, "FR", "30.39"},

                {653, 133, 271, 2.132d, "FR", "46.09"},

                {653, 331, 271, 3.650d, "FR", "83.76"},

                {123, 191, 18, 2.354d, "MC", "13.04"},

                {253, 215, 164, 1.565d, "MC", "33.03"},

                {653, 133, 271, 2.132d, "MC", "50.10"},

                {653, 331, 271, 3.650d, "MC", "91.05"},

                {191, 123, 18, 2.354d, "DOM/TOM", "13.91"},

                {253, 215, 164, 1.565d, "DOM/TOM", "33.29"},

                {653, 133, 271, 2.132d, "DOM/TOM", "49.84"},

                {653, 331, 271, 3.650d, "DOM/TOM", "89.54"}

        });
    }

    private double height;
    private double width;
    private double depth;
    private double weight;
    private String dest;
    private String expected;

    public TestPackage(double height, double width, double depth, double weight, String dest, String expected) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
        this.dest = dest;
        this.expected = expected;
    }

    @Test
    public void test() {
        //assertEquals(expected, (new Package(height,width,depth,weight)).calculateLocalShippingCost().toString());
        ShippingCostsCalculator calc = new ShippingCostsCalculator();
        Package p = PackageFactory.createPackage(height, width, depth, weight);
        assertEquals(expected, calc.calculateShippingCost(p, Destination.getDestFromString(dest)).toString());
    }
}