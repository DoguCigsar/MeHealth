package org.dogu_bhavya.mehealth;
import javafx.geometry.Insets;
import org.dogu_bhavya.mehealth.Scenemanager;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import static javafx.application.Application.launch;
public class MainMenu extends VBox {

    public MainMenu(Scenemanager sm) {
        setPadding(new Insets(30));
        setSpacing(20);

        Label title = new Label("Main Menu");

        Button questionsBtn = new Button("Questions");
        questionsBtn.setOnAction(e -> sm.Questions());

        Button chatBtn = new Button("Chat");
        chatBtn.setOnAction(e -> sm.Chat());

        Button journalBtn = new Button("Journal");
        journalBtn.setOnAction(e -> sm.Journal());

        Button settingsBtn = new Button("Settings");
        settingsBtn.setOnAction(e -> sm.Settings());

        getChildren().addAll(title, questionsBtn, chatBtn, journalBtn, settingsBtn);
    }
}
