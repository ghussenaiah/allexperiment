package com.web.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.outside.Simple;
import com.web.app.SimpleApp.Welcome;

//import com.web.app.SimpleApp.Welcome;
//import com.outside.Simple;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   Welcome wel=new Welcome();
Simple sim=new Simple();
  // String msg1=sim.getService();
  String msg=wel.getTrainingService()+wel.getDevelopementService();
  String msg1=sim.getService();
 
  //String msg=wel.getTrainingService()+wel.getDevelopementService();   
		//String msg="Hello World";
		request.setAttribute("message", msg);
		request.setAttribute("message1", msg1);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
