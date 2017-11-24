package com.fredericboisguerin.insa;

public class PackageFactory {
    public Package createPackage(double height,double width,double depth,double weight){
        if(height<229 && width<162 && depth<25){
            return new SmallPackage(height,width,depth,weight);
        }else if(weight<=1.8){
            return new MediumPackage(height,width,depth,weight);
        }else{
            return new BigPackage(height,width,depth,weight);
        }
    }
}
