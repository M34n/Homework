package com.company;

import java.util.Scanner;

public class CrossRectangle {
    double x11, y11, x12, y12, x21, x22, y21, y22;

    public static void main(String[] args) {
        Main m = new Main();
        CrossRectangle cr = new CrossRectangle();
        System.out.println("Введите координаты первого прямоугольника в формате х1 у1 х2 у2");
        Scanner sc1 = new Scanner(System.in);
        cr.x11 = sc1.nextDouble();
        sc1.nextLine();
        cr.y11 = sc1.nextDouble();
        sc1.nextLine();
        cr.x12 = sc1.nextDouble();
        sc1.nextLine();
        cr.y12 = sc1.nextDouble();
        System.out.println("Введите координаты второго прямоугольника в формате х1 у1 х2 у2");
        cr.x21 = sc1.nextDouble();
        sc1.nextLine();
        cr.y21 = sc1.nextDouble();
        sc1.nextLine();
        cr.x22 = sc1.nextDouble();
        sc1.nextLine();
        cr.y22 = sc1.nextDouble();
        sc1.close();
        cr.sortSwap(cr.x11, cr.x12, 0);
        cr.sortSwap(cr.y11, cr.y12, 1);
        cr.sortSwap(cr.x21, cr.x22, 2);
        cr.sortSwap(cr.y21, cr.y22, 3); // в х11 лежит наименьший х и т д.
        double a = cr.calcSide(cr.x11,cr.x12,cr.x21,cr.x22);
        double b = cr.calcSide(cr.y11,cr.y12,cr.y21,cr.y22);
        System.out.println("Площадь пересечения :" + Math.abs(a * b));
    }

    public void sortSwap (double z1, double z2, int flag){
        double t;
        if (z2 < z1){
            t = z1;
            z1 = z2;
            z2 = t;
    }
        switch (flag){
            case 0: x11 = z1;
                    x12 = z2;
                    break;
            case 1: y11 = z1;
                    y12 = z2;
                    break;
            case 2: x21 = z1;
                    x22 = z2;
                    break;
            case 3: y21 = z1;
                    y22 = z2;
                    break;
        }
    }

    public double calcSide (double z1, double z2, double z3, double z4){
        if (z3 > z1){
            if (z3 < z2){
                if (z4 < z2){
                    return z4 - z3;
                }
                else {
                    return z2 - z3;
                }
            }
            else return 0.0;
        }
        else {
            if (z1 < z4){
                if (z2 < z4){
                    return z2 -z1;
                }
                else{
                    return z4 - z1;
                }
            }
            else {
                return 0.0;
            }
        }
    }
}

