public class Calculate {
	static int pot = 2; 

	
	public static void calc(int result, Player pl) {
		int score = pl.getPlayerScore();
		
		switch (result) {
		case 0:
			break;
		case 1: 
            score += pot; 
            pot = 2;
            break; 
        case 2: 
        	int half = (pot / 2);
            score += half;
            pot -= half;
            break; 
        case 3: 
            score --;
            pot ++;
            break; 
        default:  
            break; 
		}
		
		pl.setPlayerScore(score);
		
		if(!check(pl)) {
			Spin.game = false;
			DreidelGame.go = false; // get rid of DreidelGame. Unnecessary code!
			System.out.println("You cannot play. Game over!");
			
		}

	}
	
	public static boolean check(Player pl) {
		if(pl.getPlayerScore() < 0) {
			return false;
		}
		else 
			return true;
	}
		
	
}
	
