package Java_Assignment3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

		
		//Create Hash map 
		HashMap<Integer,String> hashm=new HashMap<Integer,String>();
		
		// Input key and value for hash Map 
		hashm.put(1,"Vijay");
		hashm.put(2,"Mindtree");
		hashm.put(3,"EduReka");
		System.out.println(hashm);
		
		//creating entry set for hashmap
		
		Set sethash =hashm.entrySet();
		
		Iterator it = sethash.iterator();
		
		while(it.hasNext())
		{ 
 Map.Entry mapE=(Map.Entry)it.next();
 System.out.println("Key"+mapE.getKey()); 
 System.out.println("Value"+mapE.getValue()); }

		}

}
