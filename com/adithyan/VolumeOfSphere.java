package com.adithyan;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double radius = 5.0;
        double volume = volumeOfSphere(radius);
        System.out.println("Volume : "+volume);
    }

    public static double volumeOfSphere(double radius){
        return (4.0/3.0*Math.PI*Math.pow(radius,3));
    }
}
