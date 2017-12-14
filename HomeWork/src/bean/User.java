package bean;

/**
 * Created by zyf on 2017/12/14.
 */



public class User {
	private String nickname;
	private String username;
	private String password;
	private int score;

	public User(String nickname, String username, String password) {
		this.username = username;
		this.nickname = nickname;
		this.password = password;
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", nickname='" + nickname + '\'' +
				", password='" + password + '\'' +
				", score=" + score +
				'}';
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {

	}
}
