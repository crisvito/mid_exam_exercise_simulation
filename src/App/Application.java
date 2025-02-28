package App;

import java.util.*;

public class Application {
	ArrayList<Food> foods = new ArrayList<Food>();
	ArrayList<Order> orders = new ArrayList<Order>();
	
	public void addNewFood(Food food) {
		foods.add(food);
		System.out.println(food.getName() + " was successfully added to the kitchen!");
	}
	
	public void displayFoods() {
		System.out.println("Food list: ");
		System.out.println("----------------------------------------------------------------------------------------------------");
		for(Food food: foods) {
			System.out.println(food.getName() + "(" + food.getCal() + ")");
			System.out.println("Description: " + food.getDesc());
			System.out.println("Spicy Level: " + food.getSpice());
			System.out.println("Ingredients: ");
			for(Ingredient ingre: food.getIngredient()) {
				System.out.print(ingre.getIngredient() + " , ");
			}
			System.out.println("");
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
	}
	
	public void order(User user, Food food, String date) {
		Order order = new Order(user, food, date);
		orders.add(order);
		System.out.println(user.getName() + " ordered " + food.getName() + " on " + date);
	}
	
	public void displayOrders() {
		System.out.println("Order List: ");
		System.out.println("----------------------------------------------------------------------------------------------------");
		for(Order order: orders) {
			System.out.println("User: " +  order.getUser().getName() + " - " + order.getUser().getId());
			System.out.println("Food: " +  order.getFood().getName());
			System.out.println("Food: " +  order.getDate());
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
	}
}
