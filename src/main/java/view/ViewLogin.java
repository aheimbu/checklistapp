package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewLogin {

    private TextField userField;
    private PasswordField passField;
    private Button loginButton;

    public ViewLogin() {
        userField = new TextField();
        passField = new PasswordField();
        loginButton = new Button("Login");
    }

    public void init(Stage stage) {
        stage.setTitle("Login");

        Label userLabel = new Label("Username:");
        Label passLabel = new Label("Password:");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(userLabel, userField, passLabel, passField, loginButton);

        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }


    public TextField getUserField() {
        return userField;
    }

    public PasswordField getPassField() {
        return passField;
    }

    public Button getLoginButton() {
        return loginButton;
    }
}