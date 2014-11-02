import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
	
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Connection Ready!");
        connection.close();
    }
}

/*
 * CREATE TABLE tweet (number INTEGER NOT NULL AUTO_INCREMENT, id INTEGER NOT NULL UNIQUE, user TEXT CHARACTER SET utf8, text TEXT CHARACTER SET utf8, ss VARCHAR(50), location TEXT CHARACTER SET utf8, favoriteds INTEGER, retweeteds INTEGER, PRIMARY KEY (number)) ENGINE=MyISAM DEFAULT CHARSET=utf8;
 */