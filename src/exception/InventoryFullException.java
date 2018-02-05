package exception;

import Characters.Group;

public class InventoryFullException extends Exception {
	public InventoryFullException (String message) {
		super(message);
	}
}
