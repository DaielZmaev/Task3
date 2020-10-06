package ru.vsu.cs.zmaev;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final Parabola P1 = new Parabola(6, -5, 1.0 / 8);
    public static final Rec1 R1 = new Rec1(-5, 4, 0, 7);
    public static final Rec2 R2 = new Rec2(-4, 2, 1, 4);

    public static double Input(String name){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input", name);
        return scanner.nextDouble();
    }

    public static Colors getColor(double x, double y) {

       if (P1.isPointUpperParabola(x, y) && !R2.isPointInside(x, y)) {
           return Colors.GREEN;
       }
       if (R1.isPointInside(x, y) && !R2.isPointInside(x, y)){
           return Colors.ORANGE;
       }
        if (R2.isPointInside(x, y) && !P1.isPointUpperParabola(x, y)){
            return Colors.YELLOW;
        }
        if (P1.isPointUpperParabola(x, y)) {
            R2.isPointInside(x, y);
        }
        /* if (P1.isPointUpperParabola(x, y) && R2.isPointInside(x, y)){
        return Colors.GRAY;
        */
        return Colors.GRAY;
    }

    public static void PointsColor(double x, double y) {
        Colors color = getColor(x, y);
        System.out.printf("(%s, %s) -> %s%n", x, y, color);
    }

    public static void tests() {
        PointsColor(1, 3);
        PointsColor(3, 2);
        PointsColor(5, 3);
        PointsColor(-5, -5);
        PointsColor(-4, 5);
        PointsColor(-2, 2);
        PointsColor(6, -6);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        tests();

        double x = Input("x");
        double y = Input("y");
        PointsColor(x, y);

    }
}