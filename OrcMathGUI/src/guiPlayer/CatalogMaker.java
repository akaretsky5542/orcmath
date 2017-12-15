package guiPlayer;
import java.util.*;


public class CatalogMaker {
	
	private static Object input;
	private ArrayList<Food> list;
	private Object scanner;

	public CatalogMaker() {

		list = new ArrayList<Food>();
		list.add(new Food("sushi", "japanese", 10, false));
		list.add(new Food("pizza", "italian", 3, false));
		list.add(new Food("carrot", "american", 3, true));
		list.add(new Food("beat", "russian", 5, true));
		list.add(new Food("salad", "american", 11, false));
		list.add(new Food("shredded turkey", "american", 8, true));
		list.add(new Food("parmesian cheese", "italian", 9, true));
		list.add(new Food("gnocchi", "itailan", 25, true));
		list.add(new Food("pad thai", "thainese", 14, false));
	
	}

	public static void main(String[] args) {

		CatalogMaker f = new CatalogMaker();
		System.out.println(f.getCSVContent());
		Scanner in = new Scanner(System.in);
		input = in;
	}

	public String getCSVContent() {
		
		String data = "name, cuisine ,price, partOfDish\n";
		
		for(Food f: list) {
			
			data += f + "\n";
			
		}
		
		return data;
				
		
	}
	
	public void addNewFood(String name, String cuisine, int price, boolean partOfDish) {
		String input = getInput();

		input = getInput();
		
	
		
		list.add(new Food(name, cuisine, price, partOfDish));
		System.out.println("Food added successfully");
		
		
		
	}
	
	public static String getInput(){
		return in;
	}
	
	
}
