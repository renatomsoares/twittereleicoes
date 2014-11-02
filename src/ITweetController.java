import java.util.List;

public interface ITweetController {

	public void inserirTweet(int id, String user, String text, String ss, String location, int favoriteds, int retweeteds);
	//public void deletarTweet(int id);
	//public void atualizarTweet(int id, String user, String text, String ss, String location, int favoriteds, int retweeteds);
	//public List<Tweet> mostrarTweet(int id);
}