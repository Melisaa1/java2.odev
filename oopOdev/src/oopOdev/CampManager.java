package oopOdev;

public class CampManager {
	public void takeCamp(Camp camp) {
		System.out.println("kampý aldýnýz:" + camp.name);
	}
 public void add (Camp camp) {
	 System.out.println("kampýnýz eklendi:" + camp.name);
 }
 public void  delete (Camp camp) {
	 System.out.println("kampýnýz silindi:" + camp.name);
 }
 public void update (Camp camp) {
	 System.out.println("kampýnýz güncellendi:" + camp.name);
 }
 
}
