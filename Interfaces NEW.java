package com.company;

interface Bicycle {
    int a = 34;
    void applyBreak(int decrement);
    void speedUp(int increment);
}interface HornBicycle {
    void BlowHorn3g();
    void BlowHornn();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("PPI POOO");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedup");
    }
    public void BlowHorn3g(){
        System.out.println("pe pe pe pe");
    }
    public void BlowHornn(){
        System.out.println("Main hoon na pe");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        AvonCycle obj = new AvonCycle();
        obj.applyBreak(2);
        // you can create properties in interface.
        System.out.println(obj.a);
        // you can not modify the properties in interface as they re FINAL.
        // obj.a= 54;
        //  System.out.println(obj.a);
        obj.BlowHorn3g();
        obj.BlowHornn();

    }
}
