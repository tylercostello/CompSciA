package animalpackage;

import java.util.Scanner;

public class animalgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String input;
		node fishNode = new node(null,null, "Is it a fish");
		node dogNode = new node(null,null, "Is it a dog");
		node firstNode = new node(dogNode,fishNode,"Is it a mammal");
		node current = firstNode;
		
		while (true){

			System.out.println(current.getQuestion()+"? Y/N");
			input=keyboard.next();		
			//animal guessed
			
			
			if (input.equals("Y")){
				
				current=current.getYesNode();
				if (current==null){
					System.out.println("Would you like to play again? Y/N");
					input = keyboard.next();
					if (input.equals("N")){
						break;
					}
					else{
						current=firstNode;
					}
				}
			}
			else {
				//current=current.getNoNode();
				//ask question
				if (current.getNoNode()==null){
					System.out.println("What was your animal?");
					String animal = keyboard.next();
					System.out.println("Finish this sentence: An "+animal+" has ");
					String newQuestion = keyboard.next();
					node insideNode = new node(null,null, "Is it a "+animal);
					current.setNoNode(new node(insideNode,null, "Does it have "+newQuestion));
					System.out.println("Would you like to play again? Y/N");
					input = keyboard.next();
					if (input.equals("N")){
						break;
					}
					else{
						current=firstNode;
					}
				}
				else{
					current=current.getNoNode();
				}
			}
		
		
		
		}
		System.out.println("Game over");
		
	}

}

