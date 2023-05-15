package com.example.demo.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class Windows2Controller {

    private LoginWindowController controllerWindow1;
    private Stage stage;

    @FXML
    private Label labelName;
    @FXML
    private PasswordField txtPassword;

    @FXML
    void showWindow1(ActionEvent event) throws IOException {
        controllerWindow1.show(event);
        stage.close();
    }

    public void init(String user, String password, Stage stage2, LoginWindowController loginWindowController) {

        this.controllerWindow1 = loginWindowController;
        this.stage = stage2;
    }

}

