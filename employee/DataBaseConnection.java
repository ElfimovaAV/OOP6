package seminar6.employee;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static java.sql.DriverManager.getConnection;

public class DataBaseConnection {
    public Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("path"))) {
            props.load(in);
        }

        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        return DriverManager.getConnection(url, username, password);
    }

    public void saveEmployee(String query, String name, double salary) throws
            SQLException, IOException, SQLException {
        Connection connection = getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, name);
        ps.setDouble(2, salary);
        ps.executeUpdate();
    }
}
