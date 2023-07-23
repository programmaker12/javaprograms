package collectionFramework;
import java.util.*;

public class CollectionsMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(46);
        list.add(68);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);
        
        
        Collections.addAll(list, 42, 52, 86, 74, 66, 1);
        System.out.println("Initial elements :"+list);
        System.out.println("Value of maximum element from the collections: "+Collections.min(list));
        list.clear();
        System.out.println("After clearing, elements are: "+list);
	}

}
