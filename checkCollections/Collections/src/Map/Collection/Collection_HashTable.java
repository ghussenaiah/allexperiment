package Map.Collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_HashTable {

	public static void main(String args[]){  
		   
		  Map<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");
		  
		  Set<Entry<Integer,String>> values=hm.entrySet();
		  
		  for(Entry<Integer,String> m:values){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}
