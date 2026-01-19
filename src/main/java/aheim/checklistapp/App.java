package aheim.checklistapp;

import dao.*;
import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewLogin;

import java.sql.Connection;
import java.sql.SQLException;

import static javafx.application.Application.launch;

/**
 * examples, initializations, app start
 *
 */
public class App extends Application{

    public static void main(String[] args) throws SQLException {
        // testing database connection
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) System.out.println("Connected!");

        User user = new User("alex", "password");
        System.out.println(user);

        UserDAO userdao = new UserDAOImpl();
        User testuser = userdao.getUserId(1);
        System.out.println("User with id=1 from database: " + testuser);
        System.out.println(userdao.insertUser(user));

        DAOFactory daoFactory = new DAOFactory();
        System.out.println("Testing the Factory: "+daoFactory.getUserDAOImpl().getUserId(1));
        launch(args);
    }

    //@Override
    public void start(Stage stage) {
        ViewLogin loginView = new ViewLogin();
        loginView.init(stage);
    }
}