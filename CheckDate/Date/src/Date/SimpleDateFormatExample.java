package Date;

import java.text.SimpleDateFormat;  
import java.util.Date;  
public class SimpleDateFormatExample {  
public static void main(String[] args) {  
    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("20/06/1992");  
    String strDate= formatter.format(date);  
    System.out.println(strDate);  
}  
}
