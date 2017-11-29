package com.fredericboisguerin.insa;

import sun.security.krb5.internal.crypto.Des;

import java.util.Scanner;

public class UserInterfaceInlineCommand {

    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);
        String str;

        double height;
        double width;
        double depth;
        double weight;

        ShippingCostsCalculator calc = new ShippingCostsCalculator();
        String dest;

        do {
            System.out.println("-------------------------------------------- \n" +
                    "Liste des commandes disponible : \n" +
                    " - Calc -> pour calculer le cout de transport d'un package en fonction de la destination\n" +
                    " - Exit -> pour quitter\n" +
                    "--------------------------------------------\n");
            str = sc.nextLine().toLowerCase();
            str.replaceAll(" ","");
            switch(str){
                case "calc":
                    System.out.println("Dimenssion du package :\n");
                    System.out.print("height : ");
                    height = Double.parseDouble(sc.nextLine());
                    System.out.println(height);

                    System.out.print("width : ");
                    width = Double.parseDouble(sc.nextLine());

                    System.out.print("depth : ");
                    depth = Double.parseDouble(sc.nextLine());

                    System.out.print("weight : ");
                    weight = Double.parseDouble(sc.nextLine());

                    Package p = PackageFactory.createPackage(height,width,depth,weight);

                    System.out.println("destination : FR, MC, DOM/TOM");
                    dest = sc.nextLine();

                    System.out.println("\nCost : "+calc.calculateShippingCost(p,Destination.getDestFromString(dest)));

                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        } while(!str.equals("exit"));
    }
}
