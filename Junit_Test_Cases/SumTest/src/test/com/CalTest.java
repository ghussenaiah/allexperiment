package test.com;




import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

import source.com.CalService;
import source.com.ICalculator;

public class CalTest {
	
	ICalculator cal;
	CalService c;
	@Before
     public void setup() {

    	  cal=mock(ICalculator.class);	
    	   c=new CalService();
    	   
    	  when(cal.addTwo(3, 3)).thenReturn(6);
    	 c.setCal(cal);
    	 
    	 //here we are passing mock objetc that override the instance object of 
    	 //ICalculator class
	}






	@SuppressWarnings("deprecation")
	@Test
	public void test() {

		//int b=c.add(3, 4);
	//c.setCal(call);
	//	Assert.assertEquals(7, c);
		Assert.assertEquals(6, c.add(3, 3));
	
		
	}

}
