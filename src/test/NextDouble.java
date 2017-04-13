package test;

import java.util.Scanner;
public class NextDouble
{
    public static void main(String[] args){       
        Scanner in = new Scanner(System.in);
        //String a = in.nextLine();
        System.out.printf("Enter item #1: ");
        double Num1 = in.nextDouble();
        System.out.printf("Enter item #2: ");
        double Num2 = in.nextDouble();
        System.out.printf("Enter item #3: ");
        double Num3 = in.nextDouble();
        System.out.printf("Enter item #4: ");
        double Num4 = in.nextDouble();  
        System.out.printf("Enter item #5: ");
        double Num5 = in.nextDouble();
        System.out.println();
        System.out.printf("%-5s", "Item:");
        System.out.printf("%10s", "Cost:");
        System.out.printf("%10s", "Total:\n");
        System.out.printf("%5s", "#1");
        System.out.printf("%10.2f", Num1);
        System.out.printf("%8s",Num1);
        System.out.println();
        System.out.printf("%5s", "#2");
        System.out.printf("%10.2f", Num2);
        System.out.printf("%8s",Num1 + Num2);
        System.out.println();
        System.out.printf("%5s", "#3");
        System.out.printf("%10.2f", Num3); 
        System.out.printf("%8s",Num1 + Num2 + Num3);
        System.out.println();
        System.out.printf("%5s", "#4");
        System.out.printf("%10.2f", Num4);
        System.out.printf("%8s",Num1 + Num2 + Num3 + Num4);
        System.out.println();
        System.out.printf("%5s", "#5");
        System.out.printf("%10.2f", Num5);
        System.out.printf("%8.2f",Num1 + Num2 + Num3 + Num4 + Num5);

    }
}