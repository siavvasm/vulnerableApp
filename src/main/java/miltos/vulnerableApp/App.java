package miltos.vulnerableApp;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String temp = args[0];
        if(temp.equals("literal")){
        	System.out.println( "Hello World!" );
        } else {
        	System.out.println( "Goodbye World!" );
        }
    }
}
