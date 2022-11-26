package src;
import java.util.ArrayList;

public class Root{
    public String name;
    public String location;
    public ArrayList<Player> player;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<Player> getPlayer() {
		return player;
	}
	public void setPlayer(ArrayList<Player> player) {
		this.player = player;
	}
}