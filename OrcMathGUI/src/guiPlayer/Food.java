package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;

public class Food extends AnimatedComponent{
	private String name;
	private String cuisine;
	private int price;
	private boolean partOfDish;
	
	public Food(String name, String cuisine, int price, boolean partOfDish) {
		super(40, 40, 100, 100);
		addSequence("resources/food.png",  200,  1,  3,  30, 24, 12); //if animation
		Thread animation = new Thread(this);	//if animation
		animation.start(); //if animation
		update(); //if animation
		
		this.cuisine = cuisine;
		this.price = price;
		this.partOfDish = partOfDish;
		this.name = name;
		
	}
	

@Override
public void update(Graphics2D g) {
		
		super.update(g); //if animation
		
	}
	
public String toString() {
	
	
	return name + "," + cuisine + "," + price + "," + partOfDish;
	
}


}
