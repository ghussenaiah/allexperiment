import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection_Sort_Integer {
	 public static void main(String args[]){  
		 

		      List<Integer> al1=new ArrayList<>();//creating arraylist 
		      al1.add(89);
              al1.add(78);  
              al1.add(10);  
              al1.add(100);   
	  
	                    Collections.sort(al1);
	                    Collections.reverse(al1);
	                      
	                    /*   for(Integer str:al1)  
	                    	    System.out.println(str); */
	                    al1.forEach(System.out::println);
}
}
