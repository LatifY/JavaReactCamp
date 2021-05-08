package ETradeProject.jLogger;

public class jLoggerManager {
    public void log(String logMessage){
        System.out.println("J Logger: " + logMessage);
    }

    public void log(String logTitle, String logMessage){
        System.out.println(String.format("J Logger: [%s] => %s",logTitle,logMessage));
    }
}
