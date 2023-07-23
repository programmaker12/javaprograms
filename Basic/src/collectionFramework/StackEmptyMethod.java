package collectionFramework;
import java.util.*;
public class StackEmptyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> stak = new Stack<Integer>();
        
        boolean result = stak.empty();
        System.out.println("is the stack empty "+result);
        
        stak.push(78);
        stak.push(114);
        stak.push(90);
        stak.push(120);
        
        System.out.println("Elements in Stack: "+stak);
        result = stak.empty();
        System.out.println("Is the stack empty "+result);
	}

}
