//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit5;

public class FirstLastVowel
{
   public static String go( String a )
	{
	   	char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
	   	
	   	for (int i =0; i <vowels.length;i++) {
	   		if (a.charAt(0)==vowels[i] || a.charAt(a.length()-1)==vowels[i]) {
	   			return "yes";
	   		}
	   	}
	   	return "no";
	   	
	   	

	}
}