package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {
	
	static Logger logger = LogManager.getLogger(log4jdemo.class);

	public static void main(String[] args) {
		
		logger.trace("this is trace message");
		
		System.out.println("\n Hello World...! \n");
		logger.info("this is an info message");
		logger.error("this is an error message");
		logger.warn("this is a warning message");
		logger.fatal("this is a fatal message");
		
		System.out.println("completed");
		
		

	}

}
