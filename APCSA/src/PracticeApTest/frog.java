package PracticeApTest;

public class frog {
	
	public boolean simulate(){
		int distance=0;
		for (int i=0;i<maxHops;i++){
			distance=distance+hopDistance();
			if (distance>=goalDistance){
				return true;
			}
		}
		return false;
	}
	
	public double runSimulations(int num){
		double successful=0;
		for (int i=0;i<num;i++){
			if (simulate()){
				successful++;
			}
		}
		return successful/num;
	}
	
}
