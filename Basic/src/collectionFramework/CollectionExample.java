package collectionFramework;
import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        
        list.add("C");
        list.add("Core Java");
        list.add("Advance Java");
        list.add("HTML");
        
        System.out.println("Initial collection value: "+list);
        Collections.addAll(list, "Servlet", "JSP");
        System.out.println("After adding elements collection value: "+list);
        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);
        System.out.println("After adding array collection values: "+list);
	}

}
