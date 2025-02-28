package App;

import java.util.ArrayList;

public class Food {
	private String name;
	private String desc;
	private int spice;
	private int cal;
	
	ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

	
	public Food(String name, String desc, int spice,int cal) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.desc = desc;
		this.spice = spice;
		this.cal = cal;
	}
	
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getSpice() {
		return spice;
	}
	
	public int getCal() {
		return cal;
	}
	
	public ArrayList<Ingredient> getIngredient() {
		return ingredients;
	}
}
