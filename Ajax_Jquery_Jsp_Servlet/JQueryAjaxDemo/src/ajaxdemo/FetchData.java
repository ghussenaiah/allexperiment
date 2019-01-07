package ajaxdemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;


public class FetchData {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
            	Class.forName("com.mysql.jdbc.Driver");  
  			  
    			 connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam","root","root"); 
               
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
            return connection;
        }

    }
    public static ArrayList<Countries> getAllCountries() {
        connection = FetchData.getConnection();
           ArrayList<Countries> countryList = new ArrayList<Countries>();
           try {
               Statement statement = connection.createStatement();
               ResultSet rs = statement.executeQuery("select * from country limit 10");
           
               while(rs.next()) { 
                Countries country=new Countries();
                country.setCode(rs.getString("Code"));
                country.setName(rs.getString("Name"));
                   country.setContinent(rs.getString("Continent"));
                   country.setRegion(rs.getString("Region"));
                country.setPopulation(rs.getInt("Population"));
                country.setCapital(rs.getString("Capital"));
                countryList.add(country);
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }

           return countryList;
       }

}
