
public class AsteriskLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("*** " + message + " ***");
    }

    @Override
    public void error(String errorMessage) {
        String boxLine = "****************";
        String errorLine = "*** Error: " + errorMessage + " ***";

        System.out.println(boxLine);
        System.out.println(errorLine);
        System.out.println(boxLine);
    }
	
}



	


