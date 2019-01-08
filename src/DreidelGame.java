//import java.util.Scanner;

public class DreidelGame {

	public static boolean go = true;

	public static void main(String[] args) {
		//add a scanner
		//int currentPlayer = 1;
		//int next;
				
		System.out.println("Welcome to **DREIDEL**");
		
		
		
		while(go == true) {
			Spin sp = new Spin();
			Spin.turns(sp.getCurrentPlayer());
			
			
			
			//must add way to end game
		}
		
		
	}

	
	
}
	


