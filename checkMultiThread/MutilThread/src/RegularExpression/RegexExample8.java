package RegularExpression;

import java.io.Console;  
import java.util.regex.Pattern;  
import java.util.regex.Matcher;  
  
public class RegexExample8{  
    public static void main(String[] args){  
        Console console = System.console();  
        if (console == null) {  
            System.err.println("No console.");  
            System.exit(1);  
        }  
        while (true) {  
            Pattern pattern = Pattern.compile(console.readLine("Enter your regex: "));  
            Matcher matcher = pattern.matcher(console.readLine("Enter input string to search: "));  
            boolean found = false;  
            while (matcher.find()) {  
                System.out.println("I found the text "+matcher.group()+" starting at index "+  
                 matcher.start()+" and ending at index "+matcher.end());  
                found = true;  
            }  
            if(!found){  
                System.out.println("No match found.");  
            }  
        }  
    }  
}  

/*Enter your regex: java
Enter input string to search: this is java, do you know java
I found the text java starting at index 8 and ending at index 12
I found the text java starting at index 26 and ending at index 30*/