package gestiontestjunit;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Division extends Operations{
	
	public static long division(long a, long b){
		Logger logger = Logger.getLogger("logg");
		if(b == 0){
			logger.log(Level.INFO, "Test SONAR");
			throw new IllegalArgumentException("La division par b = 0 est impossible");
		}else{
			return a/b;
		}
		
	}

}
