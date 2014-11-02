import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TweetDAO implements ITweetDAO {

	private Connection connection;

	public TweetDAO() throws SQLException, ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	// Adiciona um tweet no Banco
	public void create(Tweet tweet) throws SQLException {
		
		String sql = "INSERT INTO tweet (id, user, text, ss, location, favoriteds, retweeteds) VALUES(?,?,?,?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setInt(1, tweet.getId());
		stmt.setString(2, tweet.getUser());
		stmt.setString(3, tweet.getText());
		stmt.setString(4, tweet.getSS());
		stmt.setString(5,  tweet.getLocation());
		stmt.setInt(6, tweet.getFav());
		stmt.setInt(7, tweet.getRet());
		
		stmt.execute();
		stmt.close();
	}

	/*// Remove um tweet no Banco
	public void remove(Tweet tweet) throws SQLException {
		
		String sql = "DELETE from tweet where id = ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setInt(1, tweet.getId());
		stmt.execute();
		stmt.close();
	}

	// Altera os dados do tweet
	public void update(Tweet tweet) throws SQLException {
		
		String sql = "update tweet set id = ?, user = ?, text = ?, ss = ?, location = ?, favorited = ?, retweeted = ? where id = ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setInt(1, tweet.getId());
		stmt.setString(2, tweet.getUser());
		stmt.setString(3, tweet.getText());
		stmt.setString(4, tweet.getSS());
		stmt.setString(5, tweet.getLocation());
		stmt.setInt(6, tweet.getFav());
		stmt.setInt(7, tweet.getRet());
		
		stmt.execute();
		stmt.close();	
	}
	
	// Mostra todos os tweets no Banco
	public List<Tweet> show(int id) throws SQLException {
		
		Tweet tweet = new Tweet();
		String sql = "SELECT * from tweet where id like (?) order by text";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setInt(1, id);
		List <Tweet> minhaLista = new ArrayList<Tweet>();
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			tweet.setId(rs.getInt("id"));
			tweet.setUser(rs.getString("user"));
			tweet.setText(rs.getString("text"));
			tweet.setSS(rs.getString("ss"));
			tweet.setLocation("location");
			tweet.setFav(rs.getInt("favoriteds"));
			tweet.setRet(rs.getInt("retweeteds"));
			minhaLista.add(tweet);
			
		}	
		rs.close();
		stmt.close();
		return minhaLista;
	}
	
	public List<Tweet> showAll() throws SQLException {
		Tweet tweet = new Tweet();
		String sql = "SELECT * from tweet order by text";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		List <Tweet> minhaLista = new ArrayList<Tweet>();
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			tweet.setId(rs.getInt("id"));
			tweet.setUser(rs.getString("user"));
			tweet.setText(rs.getString("text"));
			tweet.setSS(rs.getString("ss"));
			tweet.setLocation(rs.getString("location"));
			tweet.setFav(rs.getInt("favoriteds"));
			tweet.setRet(rs.getInt("retweeteds"));
			
			minhaLista.add(tweet);
		}	
		rs.close();
		stmt.close();
		return minhaLista;
	}*/

}