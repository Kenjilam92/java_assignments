package questions;

public interface Compute {
	public default long addition(int a ,int b) {
		return (long) a+b;
	}
	public default long subtraction(int a ,int b) {
		return (long) a+b;
	}
	public default long multiplication(int a ,int b) {
		return (long) a+b;
	}
	public default long division(int a ,int b) {
		return (long) a+b;
	}
}
