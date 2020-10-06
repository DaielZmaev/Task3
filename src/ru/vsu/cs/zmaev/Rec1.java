package ru.vsu.cs.zmaev;

public class Rec1 {
    public double xl;
    public double yu;
    public double xr;
    public double yd;

    public Rec1(double xl, double xr, double yd, double yu) {
        this.xl = xl;
        this.yu = yu;
        this.xr = xr;
        this.yd = yd;
    }
    public boolean isPointInside(double x, double y){
        return x > xl && x < xr && y > yd && y < yu;
    }
}