package oopOdev;

public class CampManager {
	public void takeCamp(Camp camp) {
		System.out.println("kamp� ald�n�z:" + camp.name);
	}
 public void add (Camp camp) {
	 System.out.println("kamp�n�z eklendi:" + camp.name);
 }
 public void  delete (Camp camp) {
	 System.out.println("kamp�n�z silindi:" + camp.name);
 }
 public void update (Camp camp) {
	 System.out.println("kamp�n�z g�ncellendi:" + camp.name);
 }
 
}
