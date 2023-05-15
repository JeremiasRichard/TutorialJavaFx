package com.example.demo.controlador;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WindowsUserController extends BorderPane
{
    private LoginWindowController controllerWindow1;
    private Stage stage;
    public void initUser(String user, String password, Stage stage2, LoginWindowController loginWindowController)
    {
        this.controllerWindow1 = loginWindowController;
        this.stage = stage2;
    }
}
