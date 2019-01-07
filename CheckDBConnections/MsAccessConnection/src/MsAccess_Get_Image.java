import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MsAccess_Get_Image {

	
	
	public static void main(String[] args)
    {
		FileInputStream fis = null;
    try 
      {
   	 Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DavidHusen\\Documents\\David.accdb");
  
   	String sql = "select Image from Image";

	PreparedStatement ps=conn.prepareStatement(sql);  
	ResultSet rs=ps.executeQuery();  
	if(rs.next()){//now on 1st row  
	              
	Blob b=rs.getBlob(1);//2 means 2nd column data  
	byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
	              
	FileOutputStream fout=new FileOutputStream("f:\\gggg.jpg");  
	fout.write(barr);  
	              
	fout.close();  
	}//end of if  
	System.out.println("ok");  
	              
	conn.close();


   	
      }catch(Exception e)
    {
   	   System.out.println(e);
    }
	
    }
}
