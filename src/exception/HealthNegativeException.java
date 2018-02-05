package exception;

public class HealthNegativeException {
	HealthNegativeException (int health) {
		if (health < 0) {
			System.out.println("Tout le monde est mort");
		}
	}
}
