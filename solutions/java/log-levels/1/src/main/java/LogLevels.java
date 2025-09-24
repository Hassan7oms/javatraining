public class LogLevels {
    
    public static String message(String logLine) {
        int indexSemi = logLine.indexOf(":");
        int len = logLine.length();
        return logLine.substring(indexSemi+1,len).trim();
    }

    public static String logLevel(String logLine) {
        int Lsquare = logLine.indexOf("[");
        int Rsquare = logLine.indexOf("]");
        return logLine.substring(Lsquare+1,Rsquare).toLowerCase();
    }

    public static String reformat(String logLine) {
        String loglevel = logLevel(logLine);
        String messages = message(logLine);
        String out = String.format("%s (%s)",messages,loglevel);
        return out;
        
    }
}
