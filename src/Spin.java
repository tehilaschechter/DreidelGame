import java.util.Scanner;

public class Spin {
	
	public static Scanner scanner = new Scanner(System. in);
	public int currentPlayer = 1;
	static Player Current = new Player(1,0); //WHY IS THIS STATIC??
	public static boolean game = true;
	Player pl1 = new Player (1, 0);
	Player pl2 = new Player (2, 0);
		
	public static void turns(int playerNum) {
		Spin twirl = new Spin();
		twirl.currentPlayer = playerNum;
		int res;
			
		while(game == true) {
			System.out.println("Player " + twirl.currentPlayer + ", it's your turn!");
			System.out.println("To spin, press ENTER");
			scanner.nextLine();
			
			res = turnResult();
			System.out.println(toString(res));
			Calculate.calc(res, Current);
			twirl.print();
			twirl.currentPlayer = twirl.NextPlayer(twirl.currentPlayer);
			System.out.println("");

		}
		
				
	}

	public static int turnResult(){
		double randomDouble;
		int result;
		
		randomDouble = Math.random();
		result = (int) Math.round(randomDouble * 100);
		result = result % 4;
		
		
		return result;
	}
	
	public static String toString(int result) {
		String output;
		String str;
		
		switch (result) {
		case 0:
			output = "NUN - do nothing...";
			break;
		case 1: 
            output = "GIMMEL - take it all!"; 
            break; 
        case 2: 
            output = "HEY - get half"; 
            break; 
        case 3: 
            output = "SHIN - put one in"; 
            break; 
        default: 
            output = "ERROR"; 
            break; 
		}
		
		str = "You got a " + output;
		
		return str;
	}
	
	//Transfer control of the game to the next player
			/*int NextPlayer(int current) {
				if(current == 1) {
					this.currentPlayer = 2;
				}
				else if(current == 2) {
					this.currentPlayer = 1;
				}
							
				return currentPlayer;
			}*/
			
			int NextPlayer(int current) {
				current--;
				int player = 0;
				
				switch(current) {
				case 0:
					player = 2;
					Current = pl2; //WILL THIS MAKE THEM ALL THE SAME IN THE END? DO I NEED .EQUALS?
					break;
				case 1:
					player = 1;
					Current = pl1;
					break;
				}
			
				return player;
			}
			
			public int getCurrentPlayer() {
				return currentPlayer;
			}
			public void setCurrentPlayer(int current) {
				currentPlayer = current;
			}
			
			public void print() {
				System.out.println("Player 1:" + pl1.getPlayerScore() + " Player 2:" + pl2.getPlayerScore() + " Pot:" + Calculate.pot);
			}
}
