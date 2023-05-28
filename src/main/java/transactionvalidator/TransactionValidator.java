package transactionvalidator;

public class TransactionValidator {
	public static final double MIN_AMOUNT = 1;
	public static final double MAX_AMOUNT = 5000;

	public static boolean isValidAmount(double value) {
		if (value < MIN_AMOUNT) {
			System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
			return false;
		} else if (value > MAX_AMOUNT) {
			System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
			return false;
		} else {
			return true;
		}
	}
}