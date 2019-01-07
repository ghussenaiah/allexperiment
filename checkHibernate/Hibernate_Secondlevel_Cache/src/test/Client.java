package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import beans.Student;


public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

	System.out.println("using first session");
     	   Session sss1= ss.openSession();
     	 
/*	   
 Transaction t= sss1.beginTransaction();
 Student s1=new Student(111,"abc","abc@gmail.com");
Student s2=new Student(222,"lmn","lmn@gmail.com");
 sss1.save(s1);
 sss1.save(s2);
t.commit();*/

    

     	   
     	          Student st1=(Student)sss1.get(Student.class,111);
     	          
     	                System.out.println(st1.getId());
     	                
     	               Student st2=(Student)sss1.get(Student.class,111);
     	               
     	              System.out.println(st2.getId());
     	              
     	             System.out.println("using second session");
     	             Session sss2= ss.openSession();
     	             
     	            Student st3=(Student)sss2.get(Student.class,111);
       	          
 	                System.out.println(st3.getId());
     	       
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}