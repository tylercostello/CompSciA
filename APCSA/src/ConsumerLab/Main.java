package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	
	System.out.println(Review.totalSentiment(("src/ConsumerLab/26WestReview.txt")));
	 //Output : 34.589999999999996
    System.out.println(Review.starRating("src/ConsumerLab/26WestReview.txt"));
    //Output: 4
	System.out.println(Review.fakeReview("src/ConsumerLab/simpleReview.txt"));
	//Outputs simple review with random positive adjectives
  }
}