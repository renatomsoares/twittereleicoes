


public class Tweet {
	
	public int id;
	public String user;
	public String text;
	public String ss;
	public String location;
	public int favoriteds;
	public int retweeteds;

	public Tweet(int id, String user, String text, String ss, String location, int favoriteds, int retweeteds){
		this.id = id;
		this.user = user;
		this.text = text;
		this.ss = ss;
		this.location = location;
		this.favoriteds = favoriteds;
		this.retweeteds = retweeteds;
		
	}
	
	public Tweet() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String getSS() {
		return ss;
	}
	public void setSS(String ss) {
		this.ss = ss;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getFav() {
		return favoriteds;
	}

	public void setFav(int favoriteds) {
		this.favoriteds = favoriteds;
	}

	public int getRet() {
		return retweeteds;
	}

	public void setRet(int retweeteds) {
		this.retweeteds = retweeteds;
	}

}
