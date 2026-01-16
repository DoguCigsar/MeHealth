package org.dogu_bhavya.mehealth;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import static javafx.application.Application.launch;

public class Login extends VBox {

    public Login(Scenemanager sm) {
        setPadding(new Insets(20));
        setSpacing(15);

        Label title = new Label("Login");

        TextField userName = new TextField();
        userName.setPromptText("Username");

        PasswordField password = new PasswordField();
        password.setPromptText("Password");

       Button loginBtn = new Button("Login");
       loginBtn.setOnAction(e -> sm.MainMenu());

        Button signupBtn = new Button("Sign Up");
        signupBtn.setOnAction(e -> sm.Signup());

        getChildren().addAll(title, userName, password, loginBtn, signupBtn);
    }
    public static void ogin(String[] args) {
        launch(args);
    }
}

