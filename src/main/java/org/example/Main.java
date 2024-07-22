package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        return isBarking && clock > 0 && clock < 8 || (clock > 20 && clock < 24);

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        boolean age1=firstAge<=19 && firstAge >13;
        System.out.println(age1);
        boolean age2=secondAge<=19 && secondAge >13;
        System.out.println(age2);
        boolean age3=thirdAge<=19 && thirdAge >13;
        return age1 || age2 || age3;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if(isSummer && temp >25 && temp <=45){
            return true;
        }else return !isSummer && temp > 25 && temp <= 35;
    }

    public static double area(double width, double height) {
        if(width<0 || height<0){
            return -1;
        }
            return width*height;
    }

    public static double area(double radius) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("radius:");
        if(radius<0){
            return -1;
        }
        return radius*radius*Math.PI;

    }
}
