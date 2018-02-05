package exception;

import Characters.Objects;
import game_engine.Game;

public class WantToDumpTooManyException extends Exception {

	public WantToDumpTooManyException(String message) {
		super(message);
	}
	
}
