package com.wtf.broker.proxy.server;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Efren
 */
public class ServerMain {

    private Log log = LogFactory.getLog(getClass());

    public static void main(String[] args) {
        ServerMain client = new ServerMain();
        client.run();
    }

    public void run() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/wtf/broker/proxy/server/applicationContext.xml");
        log.debug("Starting server...");
    }
}
