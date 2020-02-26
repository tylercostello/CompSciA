//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit7;
import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	
	   
	   TriangleFive tri = new TriangleFive('C', 4);
	   System.out.println(tri.toString());
	   
	   tri = new TriangleFive('A', 5);
	   System.out.println(tri.toString());
	   
	   tri = new TriangleFive('B', 7);
	   System.out.println(tri.toString());
	   
	   tri = new TriangleFive('Z', 8);
	   System.out.println(tri.toString());
	}
}
//Output
//CCCC DDD EE F 
//CCCC DDD EE 
//CCCC DDD 
//CCCC 
//
//AAAAA BBBB CCC DD E 
//AAAAA BBBB CCC DD 
//AAAAA BBBB CCC 
//AAAAA BBBB 
//AAAAA 
//
//BBBBBBB CCCCCC DDDDD EEEE FFF GG H 
//BBBBBBB CCCCCC DDDDD EEEE FFF GG 
//BBBBBBB CCCCCC DDDDD EEEE FFF 
//BBBBBBB CCCCCC DDDDD EEEE 
//BBBBBBB CCCCCC DDDDD 
//BBBBBBB CCCCCC 
//BBBBBBB 
//
//ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF G 
//ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF 
//ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE 
//ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD 
//ZZZZZZZZ AAAAAAA BBBBBB CCCCC 
//ZZZZZZZZ AAAAAAA BBBBBB 
//ZZZZZZZZ AAAAAAA 
//ZZZZZZZZ 
//
