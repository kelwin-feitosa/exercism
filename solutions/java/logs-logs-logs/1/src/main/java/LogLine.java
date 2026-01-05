public class LogLine {
    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String type = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));

        return switch (type) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default    -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {

        LogLevel level = getLogLevel();
        int numType = level.getEnumLevel();
        String message = logLine.substring(logLine.indexOf("]:") + 3).trim();

        return numType + ":" + message;
    }
}