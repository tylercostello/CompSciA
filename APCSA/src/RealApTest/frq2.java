package RealApTest;

public class frq2 {
	public static int bagApples(double targetWeight, double allowedVariation){
		double max = targetWeight-allowedVariation;
		double currentWeight=0;
		int appleCounter=0;
		while (currentWeight<=max){
			currentWeight+=getApple();
			appleCounter++;
		}
		return appleCounter;
	}
	
	
}
