package Q3Final;

import java.util.ArrayList;

public class MainLake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish redFish = new Fish("Weights:1,2,3;Lengths:1,2,3;","Red Fish");
		ArrayList<Fish> fishList = new ArrayList<Fish>();
		fishList.add(redFish);
		Lake lake = new Lake(fishList,"My Lake");
		System.out.println(lake.toString());
	}

}
