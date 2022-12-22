package numberSquare;

import java.util.*;

public class CompoundInterest {
    double principal, rate, time, compoundinterest, number;


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        CompoundInterest obj1 = new CompoundInterest();

        System.out.print("Enter Principal: ");
        obj1.principal = scan.nextDouble();
        System.out.print("Enter rate: ");
        obj1.rate = scan.nextDouble();
        System.out.print("Enter time: ");
        obj1.time = scan.nextDouble();
        System.out.print("Enter number of time compounded: ");
        obj1.number = scan.nextDouble();

        obj1.compoundinterest = obj1.principal*Math.pow(1+obj1.rate/100, obj1.time*obj1.number)-obj1.principal;

        System.out.println("Principal: " + obj1.principal);
        System.out.println("Rate: " + obj1.rate);
        System.out.println("Time: " + obj1.time);
        System.out.println("Number of time compounded: " + obj1.number);
        System.out.print("Compounded Interest: " + obj1.compoundinterest +"\n");

    }

} 
    

