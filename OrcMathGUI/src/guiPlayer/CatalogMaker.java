package guiPlayer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//<<<<<<< HEAD
//import guiTeacher.GUIApplication;
//
//
//public class CatalogMaker{
//	
//	private static Object input;
//	private  ArrayList<Food> list;
//	private Object scanner;
//
//	public CatalogMaker() {
//
//		list = new ArrayList<Food>();
//		list.add(new Food("sushi", "japanese", 10, false));
//		list.add(new Food("pizza", "italian", 3, false));
//		list.add(new Food("carrot", "american", 3, true));
//		list.add(new Food("beat", "russian", 5, true));
//		list.add(new Food("salad", "american", 11, false));
//		list.add(new Food("shredded turkey", "american", 8, true));
//		list.add(new Food("parmesian cheese", "italian", 9, true));
//		list.add(new Food("gnocchi", "itailan", 25, true));
//		list.add(new Food("pad thai", "thainese", 14, false));
//	
//	}
//
//	public static void main(String[] args) {
//
//		CatalogMaker f = new CatalogMaker();
//		System.out.println(f.getCSVContent());
//		Scanner in = new Scanner(System.in);
//		input = in;
//		
//		
//		f.testSaveContent("food.csv", f.getCSVContent());
//
//	}
//
//	public String getCSVContent() {
//		
//		String data = "name, cuisine ,price, partOfDish\n";
//		
//		for(Food f: list) {
//			
//			data += f + "\n";
//			
//		}
//		
//		return data;
//				
//		
//	}
//	
//	public void addNewFood(String name, String cuisine, int price, boolean partOfDish) {
//		String input = getInput();
//
//		input = getInput();
//		
//	
//		
//		list.add(new Food(name, cuisine, price, partOfDish));
//		System.out.println("Food added successfully");
//		
//		
//		
//	}
//	
//	public static String getInput(){
//	//	return in;
//		return null;
//	}
//	
//
//	public void testSaveContent(String fileName, String content) {
//
//		try{    
//
//			FileWriter fw=new FileWriter(fileName);    
//
//			fw.write(content);    
//
//			fw.close();    
//
//			System.out.println("Success! File \""+fileName+"\" saved!");
//
//		}catch(IOException e){
//
//			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
//
//		}
//		}
//		
//		private static List<String> testFileLoading() {
//
//			Scanner in = new Scanner(System.in);
//
//			String fileName = "";
//
//			List<String> content = new ArrayList<String>();
//
//			//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename
//
//			boolean opened = false;
//
//			while(!opened){
//
//				try {
//
//					System.out.println("Enter a file to open");
//
//					fileName = in.nextLine();
//
//					FileReader fileReader = new FileReader(new File(fileName));
//
//					String line = "";
//
//					//a BufferedReader enables us to read teh file one line at a time
//
//					BufferedReader br = new BufferedReader(fileReader);
//
//					while ((line = br.readLine()) != null) {
//
//
//
//						content.add(line);
//
//
//
//						/*
//
//						 * useful later:
//
//						 * split only a comma that has an even number of quotes ahead of it
//
//	 String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
//
//						 */
//
//
//
//
//
//					}
//
//					br.close();
//
//					opened = true;
//
//				}catch (IOException e) {
//
//					System.out.println("The file name you specified does not exist.");
//
//				}
//
//			}
//
//
//
//			//close the Scanner
//
//			in.close();
//
//			return content;
//
//		
//
//
//	}
//		
//public ArrayList<Food> getCatalog() {
//			
//			return this.list;
//			
//		}
//}
//
//
//
//
//=======

public class CatalogMaker {
	
	private static Object input;
	private  ArrayList<Food> list;
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
		
		
		testSaveContent("food.csv", f.getCSVContent());

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
	//	return in;
		return null;
	}
	

	private static void testSaveContent(String fileName, String content) {

		try{    

			FileWriter fw=new FileWriter(fileName);    

			fw.write(content);    

			fw.close();    

			System.out.println("Success! File \""+fileName+"\" saved!");

		}catch(IOException e){

			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");

		}
		}
		
		private static List<String> testFileLoading() {

			Scanner in = new Scanner(System.in);

			String fileName = "";

			List<String> content = new ArrayList<String>();

			//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename

			boolean opened = false;

			while(!opened){

				try {

					System.out.println("Enter a file to open");

					fileName = in.nextLine();

					FileReader fileReader = new FileReader(new File(fileName));

					String line = "";

					//a BufferedReader enables us to read teh file one line at a time

					BufferedReader br = new BufferedReader(fileReader);

					while ((line = br.readLine()) != null) {



						content.add(line);



						/*

						 * useful later:

						 * split only a comma that has an even number of quotes ahead of it

	 String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

						 */





					}

					br.close();

					opened = true;

				}catch (IOException e) {

					System.out.println("The file name you specified does not exist.");

				}

			}



			//close the Scanner

			in.close();

			return content;

		



	}}
//>>>>>>> branch 'version2.2' of https://github.com/akaretsky5542/orcmath.git
