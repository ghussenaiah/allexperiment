
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Collectons {
	public static void main(String args[]){  
		 
		//it prints elements in order(string values)
				      Set<String> al=new TreeSet<>();
			                       al.add("Ravi");
			                       al.add("Vijay");  
			                       al.add("Ravi");  
			                       al.add("Ajay");  
			  
			                       Iterator itr=al.iterator();
			                       while(itr.hasNext())
			                       {  
			                    	   System.out.println(itr.next());  
			                       }  
		
		//it prints elements in order(numbers)
	      Set<Integer> al1=new TreeSet<>();
                     al1.add(89);
                     al1.add(78);  
                     al1.add(10);  
                     al1.add(100);  

                     Iterator itr1=al1.iterator();
                     while(itr1.hasNext())
                     {  
                  	   System.out.println(itr1.next());  
                     }  

		
			 }  
}
