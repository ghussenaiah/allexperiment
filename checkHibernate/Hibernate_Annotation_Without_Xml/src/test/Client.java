package test;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.xml.transform.Source;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;


import beans.Student;
import beans.Student_Validation;

public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	 cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();

	   
	   
	   
	Student_Validation st=new Student_Validation();
	
	st.setId(111);
	st.setName("abc");
	st.setEmail("abc");
	st.setAdddress("jntu");
	
	
	
	ValidatorFactory vf=Validation.buildDefaultValidatorFactory();
	
	Validator v= (Validator) vf.getValidator();
	
	Set<ConstraintViolation<Student_Validation>> seterror=v.validate(st);
			
			if(!seterror.isEmpty()){
				
				for(ConstraintViolation<Student_Validation> error : seterror){
					
					System.out.println(error.getPropertyPath()+":=======:"+error.getMessage());
				}
					
			}
			else{
				
				sss.save(st);
			    t.commit();
			}
	


    //if i add cascade option in actor.hbm.xml file
	   //then there is no need to save m1 and m2
    
                       
      
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}