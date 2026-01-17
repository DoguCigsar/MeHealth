package org.dogu_bhavya.mehealth;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import static javafx.application.Application.launch;

public class Chat extends VBox
{
    public Chat(Scenemanager sm)
    {
        setPadding(new Insets(20));
        setSpacing(15);

        Label title = new Label("Chat");

        TextArea chatArea = new TextArea();
        chatArea.setEditable(false);   // user cannot edit history
        chatArea.setWrapText(true);

        // Message input
        TextField write = new TextField();
        write.setPromptText("Type your message...");

        // Send button
        Button sendBtn = new Button("Send");
        String message = write.getText().trim();
        write.setOnAction(e -> sendBtn.fire());

        // Back button
        Button backBtn = new Button("Back");
        backBtn.setOnAction(e -> sm.MainMenu());
        getChildren().addAll(title, write,backBtn,sendBtn);

    }
}
