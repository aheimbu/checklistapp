package aheim.checklistapp;

import dao.DatabaseConnection;
import dao.User;
import dao.UserDAO;
import dao.UserDAOImpl;
import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewLogin;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * examples, initializations, app start
 *
 */
public class App extends Application {

    public static void main(String[] args) throws SQLException {
        // testing database connection
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) System.out.println("Connected!");

        User user = new User("alex", "password");
        System.out.println(user);

        UserDAO userdao = new UserDAOImpl();
        User testuser = userdao.get(1);
        System.out.println("User with id=1 from database: " + testuser);

        System.out.println(userdao.insert(user));


        //launch(args);
    }

    @Override
    public void start(Stage stage) {
        ViewLogin loginView = new ViewLogin();
        loginView.init(stage);
    }
}