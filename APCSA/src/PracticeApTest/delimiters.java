package PracticeApTest;

import java.util.ArrayList;

public class delimiters {

	public ArrayList<String> getDelimitersList(String[] tokens) {
		ArrayList<String> delList = new ArrayList<String>();
		for (String currentString : tokens){
			if (currentString.equals(openDel) || currentString.equals(closeDel)){
				delList.add(currentString);
			}
		}
		return delList;
	}
	
	public boolean isBalanced(ArrayList<String> delimiters) {
		int openCount = 0;
		int closeCount = 0;
		for (String currentString : delimiters){
			if (currentString.equals(openDel)){
				openCount++;
				
			}
			else if (currentString.equals(closeDel)){
				closeCount++;
			}
		}
		if (openCount==closeCount){
			return true;
		}
		return false;
	}
	
}
