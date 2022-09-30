package com.example.dedicnostmalovanifx;

import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Triangle extends GrafickyPrvek {
    int x;
    int y;
    int velikost;

    public Triangle(int x, int y, int velikost){
        this.x = x;
        this.y = y;
        this.velikost = velikost;
    }
    public Path namalujSe() {
        Path path = new Path();

        MoveTo moveto = new MoveTo(x,y);
        //dodělat Triangle

        return path;
    }
}

