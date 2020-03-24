//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;
import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;
    int size;

    public WordSearch( int size, String str )
    {
    	this.size=size;
    	m=new String[size][size];
    	for (int i =0;i<size;i++){
    		for (int x=0;x<size;x++){
    			m[i][x]=""+str.charAt(size*i+x);
    		}
    	}
    	
    	
    }

    public boolean isFound( String word )
    {
    	for (int r=0;r<size;r++){
    		for (int c=0; c<size;c++){
    			if (checkRight(word,r,c)){
    				return true;
    			}
    			else if (checkLeft(word,r,c)){
    				return true;
    			}
    			else if (checkUp(word,r,c)){
    				return true;
    			}
    			else if (checkDown(word,r,c)){
    				return true;
    			}
    			else if (checkDiagUpRight(word,r,c)){
    				return true;
    			}
    			else if (checkDiagUpLeft(word,r,c)){
    				return true;
    			}
    			
    		}
    	}
    	return false;
    }

    
    
	public boolean checkRight(String w, int r, int c)
   {
		boolean found=true;
		if (c+w.length()<size){
			for (int i=0;i<w.length();i++){
				if (!m[r][c+i].equals(""+w.charAt(i))){
					
					found=false;
				}
				
			}
		}
		else{
			found=false;
		}
		return found;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		
		if (c+1-w.length()>=0){
			//System.out.println(c+" "+r);
			for (int i=0;i<w.length();i++){
				if (!m[r][c-i].equals(""+w.charAt(i))){
					//System.out.println(m[r][c-i]);
					//System.out.println(w.charAt(i));
					return false;
				}
				
			}
		}
		else{
			return false;
		}
		return true;
		
		
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (r+1-w.length()>=0){
			//System.out.println(c+" "+r);
			for (int i=0;i<w.length();i++){
				if (!m[r-i][c].equals(""+w.charAt(i))){
					//System.out.println(m[r-i][c]);
					//System.out.println(w.charAt(i));
					return false;
				}
				
			}
		}
		else{
			return false;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		boolean found=true;
		if (r+w.length()<size){
			for (int i=0;i<w.length();i++){
				if (!m[r+i][c].equals(""+w.charAt(i))){
					
					found=false;
				}
				
			}
		}
		else{
			found=false;
		}
		return found;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		
		boolean found=true;
		if (c+w.length()<size&&r+1-w.length()>=0){
			for (int i=0;i<w.length();i++){
				if (!m[r-i][c+i].equals(""+w.charAt(i))){
					
					found=false;
				}
				
			}
		}
		else{
			found=false;
		}
		return found;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		
		
		
		if (c+1-w.length()>=0&&r+1-w.length()>=0){
			//System.out.println(c+" "+r);
			for (int i=0;i<w.length();i++){
				if (!m[r-i][c-i].equals(""+w.charAt(i))){
					//System.out.println(m[r][c-i]);
					//System.out.println(w.charAt(i));
					return false;
				}
				
			}
		}
		else{
			return false;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
    	
    	for (int r=0;r<size;r++){
    		for (int c=0; c<size;c++){
    			System.out.print(m[r][c]);
    		}
    		System.out.println();
    	}
 		return "";
    }
}
