package oopOdev;

public class Main {

	public static void main(String[] args) {
		Camp camp1 = new Camp( 1, "java1 kampý", "10 saatlik kamp");
		
		
		Camp camp2 = new Camp();
		camp2.id = 2;
		camp2.name = "java2 kampý";
		camp2.detail = "15 saatlik kamp";
		
		Camp camp3 = new Camp();
		camp3.id = 3;
		camp3.name = "java3 kampý";
		camp3.detail = "20 saatlik kamp";
		
		
		
		Camp[] camps = {camp1,camp2, camp3};
		
		for (Camp camp : camps) {
			
			System.out.println(camp.name);
			
		}
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name= "kolay düzey kamp";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "orta düzey kamp";
		
		Category category3 = new Category();
		category3.id = 3;
		category3.name = "zor düzey kamp";
		
		
		CampManager campManager = new CampManager();
		campManager.takeCamp(camp1);
		
		campManager.add(camp2);
		
		campManager.delete(camp3);
		
		campManager.update(camp3);
		

	}

}
