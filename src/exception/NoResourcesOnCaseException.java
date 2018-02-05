package exception;

import game_engine.Game;

public class NoResourcesOnCaseException extends Exception {
	public NoResourcesOnCaseException (String message) {
		super(message);
	}
}
