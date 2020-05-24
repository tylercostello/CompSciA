package animalpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class animalgame {
	public static ArrayList<String> storageList;
	public static int spot;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempString = "Is it a mammal,Is it a dog,*,*,Is it a fish,*,*";
		String[] tempArray = tempString.split(",");
		storageList = new ArrayList<String>(Arrays.asList(tempArray));

		System.out.println();
		for (String thisString : storageList){
			System.out.print(thisString+",");
		}
		System.out.println();
		//System.out.println(storageList.toString());
		
		//storageList = new ArrayList<String>();
		Scanner keyboard = new Scanner(System.in);
		String input;
		
//		node fishNode = new node(null,null, "Is it a fish");
//		node dogNode = new node(null,null, "Is it a dog");
//		node firstNode = new node(dogNode,fishNode,"Is it a mammal");
//		node current = firstNode;
		
		spot=0;
		node firstNode=new node(null,null,null);
		node current=firstNode;
		deserialize(firstNode);
		
		storageList = new ArrayList<String>();
		serialize(firstNode);
		for (String thisString : storageList){
			System.out.print(thisString+",");
		}
		System.out.println();
		
		
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
		storageList = new ArrayList<String>();
		serialize(firstNode);
		for (String thisString : storageList){
			System.out.print(thisString+",");
		}
		System.out.println();
		System.out.println("Game over");
		
		
	}

	public static void serialize(node current){
		if (current==null){
			storageList.add("*");
			return;
		}
		storageList.add(current.getQuestion());
		serialize(current.getYesNode());
		serialize(current.getNoNode());
		
	}
	
	/*
	void serialize(Node *root, FILE *fp) 
	{ 
	    // If current node is NULL, store marker 
	    if (root == NULL) 
	    { 
	        fprintf(fp, "%d ", MARKER); 
	        return; 
	    } 
	  
	    // Else, store current node and recur for its children 
	    fprintf(fp, "%d ", root->key); 
	    serialize(root->left, fp); 
	    serialize(root->right, fp); 
	} 
	 */
	
	public static void deserialize(node noderoot){
		
		String val = storageList.get(spot);
		//System.out.println(val);
		//System.out.println(spot);
		//spot++;
		if (spot++>storageList.size()-1|| val.equals("*")){
			//System.out.println("val was star");
			return;
		}
		//if(noderoot!=null){
			//System.out.print(3);
			//current.setQuestion(val);
			//noderoot=new node(null,null,val);
			//System.out.print(4);
		noderoot=new node(new node(null,null,"*"),new node(null,null,"*"),val);
			
			deserialize(noderoot.getYesNode());
			deserialize(noderoot.getNoNode());
		//}
		//System.out.print(5);
		
	}
	/*
	// This function constructs a tree from a file pointed by 'fp' 
	void deSerialize(Node *&root, FILE *fp) 
	{ 
	    // Read next item from file. If theere are no more items or next 
	    // item is marker, then return 
	    int val; 
	    if ( !fscanf(fp, "%d ", &val) || val == MARKER) 
	       return; 
	  
	    // Else create node with this item and recur for children 
	    root = newNode(val); 
	    deSerialize(root->left, fp); 
	    deSerialize(root->right, fp); 
	} 
	*/
}

