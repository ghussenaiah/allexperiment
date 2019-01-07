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
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;


import beans.Student;

/*<property name="cache.use_query_cache">true</property>   add this property in hbm file for query cache*/

public class QueryCache{

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

     	   Session sss1= ss.openSession();
     	   
     	   Transaction t=sss1.beginTransaction();
     	 
     	   String sql="insert into StudentNew(id,name,email) select s.id,s.name,s.email from Student s";
     	           Query q1=sss1.createQuery(sql);
     	           
     	           int i=q1.executeUpdate();
     	           
     	           System.out.println(i);

              sss1.close();
              ss.close();

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}