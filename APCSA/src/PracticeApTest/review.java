package PracticeApTest;

public class review {

	public void addReview(ProductReview prodReview){
		reviewList.add(prodReview);
	}
	public int getNumGoodReviews(String prodName){
		int count=0;
		for(ProductReview prev : reviewList){
			if (prev.getName().equals(prodName)){
				if (prev.getReview().contains("best")){
					count++;
				}
			}
		}
		return count;
	}
	
}
