package org.dogu_bhavya.mehealth;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import static javafx.application.Application.launch;

public class SignupQuestions extends VBox
{
    public SignupQuestions(Scenemanager sm)
    {
        {
                setPadding(new Insets(25));
                setSpacing(15);

                Label question = new Label("What do you struggle with");

                ToggleGroup group = new ToggleGroup();
                RadioButton a = new RadioButton("Depression");
                RadioButton b = new RadioButton("Anxiety");
                RadioButton c = new RadioButton("Emotional Regulation");
                RadioButton d = new RadioButton("Emotional Suicide");

                a.setToggleGroup(group);
                b.setToggleGroup(group);
                c.setToggleGroup(group);
                d.setToggleGroup(group);

            Label q = new Label("On scale of 1 - 10 how bad would say it is");

            TextField scale = new TextField();
            scale.setPromptText("Enter a value");



                Button nextBtn = new Button("Next");
                nextBtn.setOnAction(e -> sm.MainMenu());

                getChildren().addAll(question, a, b, c,d,q,scale,nextBtn);
            }



    }

}
