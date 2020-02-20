package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	
	System.out.println(Review.totalSentiment(("src/ConsumerLab/26WestReview.txt")));
	 //Output : -2.92
    System.out.println(Review.starRating("src/ConsumerLab/26WestReview.txt"));
	System.out.println(Review.fakeReview("src/ConsumerLab/simpleReview.txt"));
  }
}