package com.example.demo;

import com.example.demo.controlador.LoginWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("/com.example.demo/vista/windows1-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root,640,480);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        LoginWindowController controller = loader.getController();
        controller.setStage(primaryStage);
        primaryStage.show();



    }

    private boolean isAdmin(String user, String password) {
        if (!user.equals("admin") || !password.equals("admin"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}