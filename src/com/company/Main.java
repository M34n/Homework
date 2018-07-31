package com.company;


import java.io.*;
import java.util.*;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc1 = new Scanner(System.in);
        double x1 = sc1.nextDouble();
        sc1.nextLine();
        double y1 = sc1.nextDouble();
        sc1.nextLine();
        double x2 = sc1.nextDouble();
        sc1.nextLine();
        double y2 = sc1.nextDouble();
        System.out.println(m.sqareRectangle(x1,y1,x2,y2));
    }

    public double sqareRectangle (double x1, double y1, double x2, double y2){
        double a = abs((x1-x2));
        double b = abs((y1-y2));
        return a*b;
    }

}
