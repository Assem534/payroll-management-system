package com.example.parrollmangmentsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController {
    private Connection connection;
    private ResultSet result;
    private PreparedStatement prepare;
    @FXML
    private Button styled_button;
    @FXML
    private Button switchButton;
    private  Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private AnchorPane Home;
    @FXML
    private AnchorPane Add_Employee;
    @FXML
    private AnchorPane Absent;
    public void loginAdmin(){

    }
    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        // Load the welcome screen
        FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome_screen.fxml"));
        Parent root = loader.load();
        Scene newScene = new Scene(root);
        String css=this.getClass().getResource("design.css").toExternalForm();
        newScene.getStylesheets().add(css);
        Stage secondStage = new Stage();
//        secondStage.initStyle(StageStyle.UNDECORATED);

        secondStage.setTitle("payroll management system");
        Image image=new Image("file:src\\images\\icon.jpeg");
        secondStage.getIcons().add(image);
        secondStage.setScene(newScene);
        secondStage.setResizable(true);
        secondStage.show();

        // Close the current (login) stage
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.close();
    }
    @FXML
    public void log_out(ActionEvent event) throws IOException {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setHeaderText(null);
        alert.setContentText("Do you want to save before logout?");
        if(alert.showAndWait().get()== ButtonType.OK){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = loader.load();
            Scene newScene = new Scene(root);
            String css=this.getClass().getResource("design.css").toExternalForm();
            newScene.getStylesheets().add(css);
            Stage login = new Stage();
//        secondStage.initStyle(StageStyle.UNDECORATED);
            login.setTitle("payroll management system");
            Image image=new Image("file:src\\images\\icon.jpeg");
            login.getIcons().add(image);
            login.setScene(newScene);
            login.setResizable(false);
            login.show();

            // Close the current (login) stage
            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            loginStage.close();
        }

    }


    public void Set_Home(ActionEvent e)throws IOException{
        Home.setVisible(true);
        Add_Employee.setVisible(false);
        Absent.setVisible(false);

    }

    public void Set_Add_Employee(ActionEvent e)throws IOException{
        Home.setVisible(false);
        Add_Employee.setVisible(true);
        Absent.setVisible(false);

    }
    public void Set_Apsent(ActionEvent e)throws IOException{
        Home.setVisible(false);
        Add_Employee.setVisible(false);
        Absent.setVisible(true);

    }
//    @FXML
//    private void minimizeWindow(ActionEvent event) {
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.setIconified(true);
//    }
//    @FXML
//    private void closeWindow(ActionEvent event) {
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.close(); // Close the window
//    }
//    private boolean isMaximized = false; // Track window state
//
//    @FXML
//    private void restoreOrMaximizeWindow(ActionEvent event) {
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//        if (isMaximized) {
//            stage.setWidth(800); // Set to default width (adjust as needed)
//            stage.setHeight(600); // Set to default height (adjust as needed)
//            stage.centerOnScreen(); // Center it on the screen
//            isMaximized = false;
//        } else {
//            stage.setMaximized(true); // Maximize window
//            isMaximized = true;
//        }
//    }

}
