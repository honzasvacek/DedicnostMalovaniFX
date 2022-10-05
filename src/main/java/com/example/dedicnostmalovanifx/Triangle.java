package com.example.dedicnostmalovanifx;
import java.lang.Math;

import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Triangle extends GrafickyPrvek {
    int x;
    int y;
    int velikost;
    double v = Math.sqrt((velikost*velikost - (velikost/2)*(velikost/2)));

    public Triangle(int x, int y, int velikost){
        this.x = x;
        this.y = y;
        this.velikost = velikost;
    }
    public Path namalujSe() {
        Path path = new Path();

        MoveTo moveTo = new MoveTo(x,y);
        LineTo line1 = new LineTo(x + velikost,y);
        LineTo line2 = new LineTo(x + velikost/2, v);
        LineTo line3 = new LineTo(x,y);

        path.getElements().addAll(moveTo);
        path.getElements().addAll(line1, line2, line3);

        return path;
    }
}

