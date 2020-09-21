package com.Javapractice;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class); 
    public static void main( String[] args )
    {
    	String message="Hello,World";
        LOG.debug(message + "Will Be Printed on Debug");
        LOG.info(message + "Will Be Printed on Info");
        LOG.warn(message + "Will Be Printed on Warn");
        LOG.error(message + "Will Be Printed on error");
        LOG.fatal(message + "Will Be Printed on fatal");
        LOG.info("Appending String: {}." + message);
        System.out.println(message);
<<<<<<< HEAD

        System.out.println("HELLO");

        System.out.println("KIRTI");

=======
        System.out.println("KIRTI");
>>>>>>> refs/remotes/origin/master
    }
}
