package proji;

public class HeaderHomePage {

	public static void main(String[] args) {
		
		
		
		System.out.println(getDurationString(240,59));    

//		int positionInHignScoreTable = calculateHighScorePosition(500);
//		displayHignScorePosition("Tim", positionInHignScoreTable);
//		calcFeetAndInchToCentimeter(0, 11);
//
//	}
//
//	public static void displayHignScorePosition(String playerName, int positionInHignScoreTable) {
//		System.out.println(
//				playerName + " manage to get into position " + positionInHignScoreTable + " on the high score table");
//	}
//
//	public static int calculateHighScorePosition(int playerScore) {
//
//		if (playerScore >= 1000) {
//			return 1;
//		} else if (playerScore >= 500 && playerScore < 1000) {
//			return 2;
//		} else if (playerScore >= 100 && playerScore < 500) {
//			return 3;
//		} else
//			return 4;
//	}
//
//	public static double calcFeetAndInchToCentimeter(double feet, double inch) {
//		if ((feet < 0) || ((feet < 0) && (inch <= 12))) {
//
//			double totalInches = feet * 12 + inch;
//			calcFeetAndInchToCentimeter(totalInches);
//			
//		} else {
//			return -1 ;
//		}
//		return inch;
//	}
//
//	public static double calcFeetAndInchToCentimeter(double inch) {
//
//		if (inch >= 0) {
//			double totalcenti = inch * 2.54;
//			System.out.println(totalcenti);
//			return totalcenti;
//			
//
//		} else
//			return -1;
//
	}
	
	public static String getDurationString(long min, long sec) {
		if((min< 0)||(sec<0) || (sec>59)) {
			
			return "invalid value";

		}
		
		long hours = min/60;
		long remaningmin = min%60;
		return hours +"h" + remaningmin +"m" + sec +"s";
		
		
	}
	

}
