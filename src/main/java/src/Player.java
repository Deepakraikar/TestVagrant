package src;

public class Player{
	public static int indianPlayer;
	public static int foreignPlayer;
	public static int wicketKeeper;
	
    public String name;
    public String country;
    public String role;
    public String price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
    
	public static void initialize()
	{
		indianPlayer = 0;
		foreignPlayer = 0;
		wicketKeeper = 0;
	}
}
