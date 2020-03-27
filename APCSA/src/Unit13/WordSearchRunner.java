//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;
import java.util.*;
import java.io.*; 

public class WordSearchRunner
{
    public static void main(String[] args) throws Exception
    {
    	  WordSearch ms = new WordSearch(8,"APPLEXYPXLHJKEEDEGGLLXXCGFPDGOGNMYNTAHUUPUQDGBTSBTHIGHMSILKXLTHIS");
    	  String[] words = "APPLE AXE APEX CAT HEX EGG HAT COMPUTER GUM THIS TUG THIGH".split(" ");
    	  System.out.println( ms );
    	  
    	  for( String s : words )
    	  {
    	  	  if( ms.isFound( s) )
    	  	  {
    	  	  	  System.out.println( s + " was found in the matrix.");
    	  	  }
    	  	  else
    	  	  {
    	  	     System.out.println( s + " was not found in the matrix.");
    	  	  }
    	  }
    }
}
/*
APPLEXYP
XLHJKEED
EGGLLXXC
GFPDGOGN
MYNTAHUU
PUQDGBTS
BTHIGHMS
ILKXLTHI

APPLE was found in the matrix.
AXE was found in the matrix.
APEX was not found in the matrix.
CAT was not found in the matrix.
HEX was not found in the matrix.
EGG was found in the matrix.
HAT was found in the matrix.
COMPUTER was not found in the matrix.
GUM was not found in the matrix.
THIS was not found in the matrix.
TUG was found in the matrix.
THIGH was found in the matrix.

*/