package PracticeApTest;
import java.util.ArrayList;
public class StepTracker {
	private int stepReq;
	private int numActiveDays;
	private double averageSteps;
	private ArrayList<Integer> stepCounts = new ArrayList<Integer>();
	public StepTracker(int activeSteps){
		stepReq=activeSteps;
	}
	public void addDailySteps(int numSteps){
		stepCounts.add(numSteps);
		if (numSteps>=stepReq){
			numActiveDays++;
		}
	}
	public int activeDays(){
		return numActiveDays;
	}
	public double averageSteps(){
		double sum=0;
		for (int i : stepCounts){
			sum+=i;
		}
		return sum/stepCounts.size();
	}
	
}
