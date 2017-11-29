package com.fredericboisguerin.insa;

public class PackageFactory {
    public static Package createPackage(double height,double width,double depth,double weight){
        if(     height<229 && width<162 && depth<25
            ||  height<229 && depth<162 && width<25
            ||  width<229 && height<162 && depth<25
            ||  width<229 && depth<162 && height<25
            ||  depth<229 && width<162 && height<25
            ||  depth<229 && height<162 && width<25){
            return new SmallPackage(height,width,depth,weight);
        }else if(weight<=1.8){
            return new MediumPackage(height,width,depth,weight);
        }else{
            return new BigPackage(height,width,depth,weight);
        }
    }
}
