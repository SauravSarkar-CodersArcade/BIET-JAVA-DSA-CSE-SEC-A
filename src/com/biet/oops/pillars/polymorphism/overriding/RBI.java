package com.biet.oops.pillars.polymorphism.overriding;
public class RBI {
    double rateOfInterest(){
        return 8.2;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 8.5;
    }
}
class IDBI extends RBI{
    @Override
    double rateOfInterest(){
        return 8.0;
    }
}
class Main {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        ICICI icici = new ICICI();
        IDBI idbi = new IDBI();
        System.out.println("Rate of interest of RBI: " + rbi.rateOfInterest() + "%");
        System.out.println("Rate of interest of ICICI: " + icici.rateOfInterest() + "%");
        System.out.println("Rate of interest of IDBI: " + idbi.rateOfInterest() + "%");
    }
}
