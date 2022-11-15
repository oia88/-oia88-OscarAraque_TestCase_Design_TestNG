package reporting;

import org.slf4j.LoggerFactory;

public class Reporter {
    public Reporter(){}

    private static org.slf4j.Logger getLogger(){return LoggerFactory.getLogger(Reporter.class);}

    public static void info(String text){
        getLogger().info(text);
    }

    public static void error(String text){
        getLogger().error(text);
    }

    public static void warning(String text){
        getLogger().warn(text);
    }
}













