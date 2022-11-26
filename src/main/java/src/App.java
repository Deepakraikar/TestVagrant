package src;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) {
		inputJson in = new inputJson();
		String jsonstr = in.getTeam();

		ObjectMapper om = new ObjectMapper();
		try {
			Root root = om.readValue(jsonstr, Root.class);
			Player.initialize();
			ArrayList<Player> list = root.getPlayer();
			for (Player i : list) {
				String country = i.getCountry();
				String role = i.getRole();

				switch (country) {
				case "India":
					Player.indianPlayer++;
					break;
				default:
					Player.foreignPlayer++;
				}

				if (role.equalsIgnoreCase("Wicket-keeper"))
				{
					Player.wicketKeeper++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if ((Player.foreignPlayer == 4) && (Player.wicketKeeper > 0) && (Player.foreignPlayer+Player.indianPlayer)== 11)
		{
			System.out.println("Team can be formed with "+Player.indianPlayer+" INDIAN players,"+Player.foreignPlayer+" FOREIGN players and having "+Player.wicketKeeper+" wicket keeper.");
		}
		else if(Player.foreignPlayer != 4)
		{
			System.out.println("Team can't be formed with "+Player.foreignPlayer+" foreign players, as per the IPL rules squad should have only 4 foreign players.");
		}
		else if(Player.wicketKeeper == 0)
		{
			System.out.println("Team must have atleast one weeket keeper.");
		}
		else if(Player.indianPlayer != 7)
		{
			System.out.println("Team should have only 7 indian players , since we're already selected "+Player.foreignPlayer+" Foreign players to the squad.");
		}

	}
}
