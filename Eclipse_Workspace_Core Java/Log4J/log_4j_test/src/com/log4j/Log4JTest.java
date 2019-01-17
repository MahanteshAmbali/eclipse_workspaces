package com.log4j;

//import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4JTest {

/*	private static final Logger log = Logger.getLogger(Log4JTest.class.getName());
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		//PropertyConfigurator.configure("log_4j_test_log.properties");
		
		//PropertyConfigurator.configure("log_4j_DailyRollingFA.properties");
		
		//		RollingFileAppender r1 = new RollingFileAppender();
//		r1.setMaxFileSize("1KB");
		//log.setLevel(Level.DEBUG);
		log.trace("From Trace");
		log.debug("From Debug");
		log.info("From Info");
		log.warn("From Warn");
		log.error("From Error");
		log.fatal("From Fatal");
	}*/
	
	private static final Logger log = Logger.getLogger(Log4JTest.class.getName());
	public static void main(String[] args) {
		PropertyConfigurator.configure("log_4j_DailyRollingFA.properties");
		//log.setLevel(Level.ALL);
		log.trace("From Trace");
		log.debug("From Debug");
		log.warn("From Warn");
		log.info("From Info");
		log.error("From Error");
		log.fatal("From Fatal");
	}
}
