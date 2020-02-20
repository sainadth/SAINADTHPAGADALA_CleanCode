package org.example;
import java.lang.Math;
public class Interest {
    public static double simpleInterest(double principal_amount, double time, double interest_amount){
        return Math.round(principal_amount*time*interest_amount/100);
    }
    public static double compoundInterest(double principal_amount, double time, double interest_amount){
        return Math.round(principal_amount*(Math.pow((1+ interest_amount/100), time) - 1));
    }
}
