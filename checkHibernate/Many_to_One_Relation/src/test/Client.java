package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movies;








public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();
	   
	   Actor a=new Actor();
	   Movies m1=new Movies();
	   Movies m2=new Movies();
	   m1.setMid(1);
	   m1.setMname("thamudu");

	   
	   m2.setMid(2);
	   m2.setMname("jalsa");
	   
	   

	   
	  Set<Movies> mm=new HashSet<Movies>();
	  
	  mm.add(m1);
	  mm.add(m2);
	  
	  
	   a.setAid(1);
	   a.setActorname("powerstar");
	   a.setMovies(mm);
	   
   //  sss.save(m1);
  //   sss.save(m2);  if i add cascade option in actor.hbm.xml file
	   //then there is no need to save m1 and m2
     sss.save(a); 
       t.commit();                    
      
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}