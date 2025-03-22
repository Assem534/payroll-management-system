package com.example.parrollmangmentsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.regex.Pattern;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene = new Scene(root);
        String css=this.getClass().getResource("design.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("payroll management system");
        Image image=new Image("file:src\\images\\icon.jpeg");
       stage.getIcons().add(image);
       stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}