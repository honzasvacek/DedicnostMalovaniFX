package com.example.dedicnostmalovanifx;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class GrafickyPrvek{
    public Path namalujSe() {
        Path tah = new Path();
        MoveTo moveTo = new MoveTo(10,10);
        LineTo lineTo = new LineTo(110,110);

        tah.getElements().add(moveTo);
        tah.getElements().add(lineTo);
        return tah;
    }
}