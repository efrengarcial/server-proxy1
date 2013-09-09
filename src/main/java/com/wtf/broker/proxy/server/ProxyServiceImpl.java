package com.wtf.broker.proxy.server;

import com.wtf.broker.shared.Message;
import com.wtf.broker.shared.Response;
import com.wtf.broker.shared.ProxyService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Efren
 */
public class ProxyServiceImpl implements ProxyService {

    private Log log = LogFactory.getLog(getClass());

    public Response getCotizacion(Message message) {
        String messageText = message.getText();
        log.debug("getCotizacion() is called, message text: " + messageText);
        Response response = new Response();
        String text = "esponse from server, your message:  " + messageText;
        response.setText(text);
        return response;
    }

}