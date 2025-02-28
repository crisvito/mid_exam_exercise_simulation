package App;

public class Order {
	private User user;
	private Food food;
	private String date;
	private static int count;
	
	public Order(User user, Food food, String date){
		this.user = user;
		this.food = food;
		this.date = date;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	public String getDate() {
		return date;
	}
	public User getUser() {
		return user;
	}
	public Food getFood() {
		return food;
	}
}
