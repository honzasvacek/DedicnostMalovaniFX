package com.example.dedicnostmalovanifx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MojeMalovani extends Application {
    List<GrafickyPrvek> mojeScena;

    public MojeMalovani() {
        mojeScena = new ArrayList<>();
        mojeScena.add(new GrafickyPrvek());
        //mojeScena.add(new Obdelnik(100,100, 300, 91));
        //mojeScena.add(new Triangle(50,100,100));

        mojeScena.add(new Ctverec(50,50));
    }

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        for (GrafickyPrvek n: mojeScena) {
            root.getChildren().add(n.namalujSe());
        }

        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}