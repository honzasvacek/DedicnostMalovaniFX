package com.example.dedicnostmalovanifx;

import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Obdelnik extends GrafickyPrvek {
    int x;
    int y;
    int velikostX;
    int velikostY;

    public Obdelnik(int x, int y, int velikostX, int velikostY){
        this.x = x;
        this.y = y;
        this.velikostX = velikostX;
        this.velikostY = velikostY;

    }
    public Path namalujSe(){
        Path path = new Path();

        MoveTo moveTo = new MoveTo(x, y);
        LineTo line1 = new LineTo(x+velikostX, y);
        LineTo line2 = new LineTo(x + velikostX, y + velikostY);
        LineTo line3 = new LineTo(x, y + velikostY);
        LineTo line4 = new LineTo(x,y);

        path.getElements().addAll(moveTo);
        path.getElements().addAll(line1, line2, line3, line4);

        return path;
    }
}
