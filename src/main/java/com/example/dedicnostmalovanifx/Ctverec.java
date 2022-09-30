package com.example.dedicnostmalovanifx;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Ctverec {
    public Path namalujSe() {
        Path path = new Path();
        MoveTo moveTo = new MoveTo(10, 10);
        LineTo line1 = new LineTo(110, 10);
        LineTo line2 = new LineTo(110,110);
        LineTo line3 = new LineTo(10,110);
        LineTo line4 = new LineTo(10, 10);

        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4);

        return path;
    }
}