package com.example.demo.controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginWindowController extends BorderPane {
    private  Stage stage1;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPassword;

    @FXML
    void showWindow2(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com.example.demo/vista/windows2-view.fxml"));
        Parent root = loader.load();
        Windows2Controller controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(scene);
        controller.init(txtName.getText(),txtPassword.getText(),stage2, this);
        stage2.initStyle(StageStyle.UNDECORATED);
        stage2.show();
        this.stage1.close();
    }

    @FXML
    void closeApplication(ActionEvent event) throws IOException
    {
        stage1.close();
    }
    public void setStage(Stage primaryStage)
    {
        stage1 = primaryStage;
    }

    public void show(ActionEvent event)
    {
        stage1.show();
    }
}