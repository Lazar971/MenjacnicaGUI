package ingredients.recipes;

import java.util.LinkedList;

import ingredients.Ingredient;

public class Recipe {
	private String name;
	private LinkedList<Ingredient> ingredients=new LinkedList<Ingredient>();
	private String preparation;
	private int prepTimeMin;
	
	
	
	
	
	public boolean isVegan() {
		for(Ingredient i: ingredients)
			if(!i.isVegan())return false;
		return true;
		
	}
	public void addIngredient(Ingredient ing) {
		if(ing ==null)throw new NullPointerException();
		ingredients.add(ing );
	}
	public int getPrepTimeMin() {
		return prepTimeMin;
	}
	public void setPrepTimeMin(int prepTimeMin) {
		this.prepTimeMin = prepTimeMin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(LinkedList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public String getPreparation() {
		return preparation;
	}
	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
