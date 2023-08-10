public class SpacedLogger implements Logger {

	@Override
	public void logInfo(String message) {
			String spacedMessage = addSpaces(message);
			System.out.println(spacedMessage);
	}
	
	@Override
	public void logError(String errorMessage) {
			String spacedErrorMessage = addSpaces("ERROR: " +errorMessage);
			System.out.println(spacedErrorMessage);
			
	}
	
	private String addSpaces(String input) {
		StringBuilder spacedMessage = new StringBuilder();
		for (int i = 0; i <input.length(); i++) {
			spacedMessage.append(input.charAt(i)).append(" ");
		
		}
		return spacedMessage.toString().trim();
		
	}

	@Override
	public void error(String error) {
		
	}

	@Override
	public void log(String message) {
		
	}
	}