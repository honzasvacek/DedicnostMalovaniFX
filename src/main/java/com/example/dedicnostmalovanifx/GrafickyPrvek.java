package com.example.dedicnostmalovanifx;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class GrafickyPrvek{

    Color aktualniBarva;
    public Path namalujSe() {
        Path tah = new Path();
        return tah;
    }

    public void nastavBarvu() { //nastavuje barvu
        aktualniBarva = Color.RED;
    }

    public void nastavBarvu(boolean b) { //nastuvuje černou nebo bílou

    }

    public void nastavBarvu(double d){ //nastavuje jak černý nebo bílí bude obrazec
        Color.gray(d);
    }
}