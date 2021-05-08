package ETradeProject.core.concretes;

import ETradeProject.core.abstracts.LoggerService;
import ETradeProject.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements LoggerService {

    jLoggerManager jLogger = new jLoggerManager();

    public void log(String logMessage) {
        jLogger.log(logMessage);
    }

    public void log(String logTitle, String logMessage) {
        jLogger.log(logTitle, logMessage);
    }
}
