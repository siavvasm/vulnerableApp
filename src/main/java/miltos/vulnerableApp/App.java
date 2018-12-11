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
        String temp = args[0]; // This variable may be potentially tainted!
        
        if (temp != null && isClean(temp)) {
            if(temp.equals("literal")){
            	//System.out.println( "Hello World!" );
            } else {
            	//System.out.println( "Goodbye World!" );
            }
        }
        
        AnotherClass aClass = new AnotherClass();
        aClass.method(temp);
        aClass.method2(temp);
        
        ExtraClass eClass = new ExtraClass();
        eClass.method(temp);
        eClass.method2(temp);

    }
    
    public static boolean isClean(String userInput) {
    	/*
    	 * Add appropriate security checks here...
    	 */
    	return true;
    }
}
