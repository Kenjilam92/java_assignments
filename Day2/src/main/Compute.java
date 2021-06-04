package main;

public interface Compute {
	public default int addition( int n, int m) {
		return n+m;
	};
	public default int subtraction( int n, int m) {
		return n-m;
	};
	public default int multiplication( int n, int m) {
		return n*m;
	};
	public default double division( double n, double m) {
		return n/m;
	};
	
}
