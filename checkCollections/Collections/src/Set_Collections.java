import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set_Collections {

	
	public static void main(String args[]){  
		 
//it does not accept duplicate values
		      Set<String> al=new HashSet<>();
	                       al.add("Ravi");
	                       al.add("Vijay");  
	                       al.add("Ravi");  
	                       al.add("Ajay");  
	  
	                       Iterator itr=al.iterator();
	                       while(itr.hasNext())
	                       {  
	                    	   System.out.println(itr.next());  
	                       }  
	 }  
}
