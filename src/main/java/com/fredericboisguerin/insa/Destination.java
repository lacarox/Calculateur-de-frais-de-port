package com.fredericboisguerin.insa;

public enum Destination {
    FR,
    MC,
    DOMTOM;

    public static Destination getDestFromString(String d){
        switch (d){
            case "FR":
                return FR;
            case "MC":
                return MC;
            case "DOM/TOM":
                return DOMTOM;
        }
        return null;
    }
}
