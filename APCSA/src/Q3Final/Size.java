package Q3Final;

public class Size {
	int[] weights;
	int[] lengths;

	public Size(int[] weights, int[] lengths){
		setWeights(weights);
		setLengths(lengths);
		
	}
	public void setWeights(int[] weights){
		this.weights=new int[weights.length];
		for (int i=0;i<weights.length;i++){
			
			this.weights[i]=weights[i];
		}
	}
	public void setLengths(int[] lengths){
		this.lengths=new int[lengths.length];
		for (int i=0; i<lengths.length;i++){
			this.lengths[i]=lengths[i];
		}
	}
	
	public String toString(){
		String returnString="Weights ";
		for (int i : weights){
			
			returnString+=i+" ";
		}
		returnString+="Lengths ";
		for (int i : lengths){
			returnString+=i+" ";
		}
		return returnString;
	}
}
