import java.util.ArrayList;

public class AddAll {

	 public static void main(String args[]){  
		   
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		    
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Sonoo");  
		  al2.add("Hanumat"); 
		  al2.add("Hanumat"); 
		    
		  al.addAll(al2);    
		  
		     for(String str:al)  
         	    System.out.println(str); 
		 }  
	
	
}
