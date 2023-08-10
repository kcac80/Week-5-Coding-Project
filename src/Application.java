
public class Application {

	public static void main(String[] args) {

		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		
		Logger spacedLogger = new SpacedLogger();
		
		logger.log("ERROR: ");
			
		
	}

}
