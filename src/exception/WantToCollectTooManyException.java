package exception;

import Characters.Objects;
import game_engine.Game;

public class WantToCollectTooManyException extends Exception {

	public WantToCollectTooManyException(int x, int y, Game game, Objects object, int number_to_collect) {
		if (game.board.mapMatrix[x][y].howManyObjectOnCase(object) < number_to_collect){
			System.out.println("Vous ne pouvez pas ramasser autant de "+object.name+" sur cette case");
		}
	}
	
}
