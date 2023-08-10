public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();

        asteriskLogger.log("Hello from AL");
        asteriskLogger.error("Issue came up");

        Logger spacedLogger = new SpacedLogger();

        spacedLogger.log("Hello from SL");
        spacedLogger.error("Issue occurred");
    }
}
