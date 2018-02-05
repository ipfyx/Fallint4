package exception;

import environment.CaseType;

public class CaseOutOfRangeException extends Exception {
	
	/*public CaseOutOfRangeException(int x, int y) {
		if (x > 1 || y > 1) {
			System.out.println("La case est trop eloignee de votre position, deplacez vous sur une case adjacente");
		}
		
		else if (x == 0 && y == 0) {
			System.out.println("Vous ne pouvez pas vous déplacer sur la case sur laquelle vous vous trouvez");
		}
	}
	*/
	
	public CaseOutOfRangeException(String message){
		super(message);
	}
	
	/*public CaseOutOfRangeException (CaseType terrain) {
		if (terrain == CaseType.nonexistent || terrain == null) {
			System.out.println("La case est en dehors du plateau, vous ne pouvez pas vous y deplacer");
		}
	}*/
	
}
