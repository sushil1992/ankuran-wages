package com.ankuran.wages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
public class LogUtil {
    private static final Logger AUDIT_LOG = LogManager.getLogger("AuditLog");
    private static final Logger ERROR_LOG = LogManager.getLogger("ErrorLog");
    private static final Logger INFO_LOG = LogManager.getLogger("InfoLog");

    private LogUtil() {
    }

    public static Logger getAuditLogger() {
        return AUDIT_LOG;
    }

    public static Logger getErrorLogger() {
        return ERROR_LOG;
    }

    public static Logger getInfoLogger() {
        return INFO_LOG;
    }

    public static final void printInErrorLogs(String errorMsg, Exception e) {
        AUDIT_LOG.error(errorMsg, e);
    }
}
