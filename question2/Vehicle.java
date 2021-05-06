import java.util.Scanner;

class Vehicle {
	public String setSpeed(int s)throws SpeedInValidException{
		
		if(s >= 30 && s <= 90) {
			return "Valid Speed";
		}
		else {
			throw new SpeedInValidException("SpeedInvalidException");
		}
	}
	public class SpeedInValidException extends Exception {
		public SpeedInValidException() {
			super();
		}
		public SpeedInValidException(String s) {
			super(s);
		}
		public String toString() {
			return "SpeedInvalidException";
		}
	}
	
	public static void main(String[] args) throws Vehicle.SpeedInValidException {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Vehicle v = new Vehicle();
	v.setSpeed(n);
}
}
