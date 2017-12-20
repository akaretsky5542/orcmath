package myStuff;

import java.util.List;

import guiPlayer.CatalogMaker;
import guiPlayer.Food;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.RadioButton;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen{
	
	private TextField mainField;
	private Button addbutton;
	private CatalogMaker catalog;
	private Button add;
	private TextField cuisine;
	private TextField name;
	private TextField price;
	private TextField partOfDish;
	private RadioButton rb1;
	private RadioButton rb2;

	

	public CatalogScreen(int width, int height) {
		super(width,height);
		mainField = new TextField(40,40,200,30,"text goes here","description");

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		catalog = new CatalogMaker();
		
		
		mainField = new TextField(40,40,200,30,"mainfield","description");

		viewObjects.add(mainField);
		
		rb1 = new RadioButton(480, 40, 30, 30, "true", null);
		rb2 = new RadioButton(520, 40, 30, 30, "false", null);
		rb1.addPeer(rb2);
		rb2.addPeer(rb1);
		viewObjects.add(rb1);
		viewObjects.add(rb2);

		name = new TextField(20,20,100,10,"text goes here","Dish name");
		viewObjects.add(name);
		
		cuisine = new TextField(20,20,100,10,"text goes here");
		viewObjects.add(cuisine);
		
		price = new TextField(20,20,100,10,"text goes here");
		viewObjects.add(price);
		
		partOfDish = new TextField(20,20,100,10,"text goes here");
		viewObjects.add(partOfDish);

		

		addbutton = new Button(20,20,20,20, "someButton", new Action() {
			
			@Override
			public void act() {

				addButtonclicked();
				
			}
		});
		viewObjects.add(addbutton);
	}
	
	protected void addButtonclicked() {
		
		Food f = new Food(mainField.getText(), " default something" , 2, true);
		
		String s = name.getText() + "f";
		
		catalog.addNewFood(name.getText(), cuisine.getText(), Integer.parseInt(price.getText()), rb1.isSelected());
		
		name.setText(" ");
		cuisine.setText(" ");
		price.setText(" ");
		partOfDish.setText(" ");
		
	}

	private void setScreen(CatalogScreen window) {
		
	}

	public static void main(String[] args) {
		
	}


}
