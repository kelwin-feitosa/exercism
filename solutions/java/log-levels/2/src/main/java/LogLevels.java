public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        String messagePart = logLine.substring(colonIndex + 1);
        
        return messagePart.trim();
    }

    public static String logLevel(String logLine) {
        int openingBracket = logLine.indexOf("[");
        int closingBracket = logLine.indexOf("]");
        String messagePart = logLine.substring(openingBracket+1, closingBracket);
        
        return messagePart.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
