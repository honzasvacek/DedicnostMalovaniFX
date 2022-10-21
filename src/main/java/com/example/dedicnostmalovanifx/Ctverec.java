package com.example.dedicnostmalovanifx;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Ctverec extends GrafickyPrvek {
    int x;
    int y;
    int velikost;

    public Ctverec(int x, int y, int velikost){
        this.x = x;
        this.y = y;
        this.velikost = velikost;
    }

    public Ctverec(int x, int y){
        this.x = x;
        this.y = y;
        this.velikost = 10;
    }

    public Ctverec(int x, int y, int velikost, double d){
        this.x = x;
        this.y = y;
        this.velikost = velikost;
        Color.gray(d);
    }

    public Ctverec(int x, int y, int velikost, boolean b){
        this.x = x;
        this.y = y;
        this.velikost = velikost;
        if(b){aktualniBarva = Color.WHITE;}
        else aktualniBarva = Color.BLACK;
    }
    public Path namalujSe() {
        Path path = new Path();
        MoveTo moveTo = new MoveTo(x, y);
        LineTo line1 = new LineTo(x+velikost, y);
        LineTo line2 = new LineTo(x + velikost, y + velikost);
        LineTo line3 = new LineTo(x, y + velikost);
        LineTo line4 = new LineTo(x,y);

        path.getElements().addAll(moveTo);
        path.getElements().addAll(line1, line2, line3, line4);

        return path;
    }

}