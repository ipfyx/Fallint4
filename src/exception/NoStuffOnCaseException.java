package exception;

import game_engine.Game;

public class NoStuffOnCaseException extends Exception {
	public NoStuffOnCaseException (String message) {
		super(message);
	}
}
