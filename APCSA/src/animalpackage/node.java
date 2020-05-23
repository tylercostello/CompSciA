package animalpackage;

public class node {
	
	private node yesNode;
	private node noNode;
	private String question;
	
	public node(node yesP,node noP, String newQ){
		yesNode = yesP;
		noNode=noP;
		question=newQ;
		
	}

	public node getYesNode() {
		return yesNode;
	}

	public void setYesNode(node yesNode) {
		this.yesNode = yesNode;
	}

	public node getNoNode() {
		return noNode;
	}

	public void setNoNode(node noNode) {
		this.noNode = noNode;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public boolean isEnd(){
		if (getYesNode()==null && getNoNode()==null){
			return true;
		}
		return false;
	}
	
}
