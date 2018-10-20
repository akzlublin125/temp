package pl.com.pko.avscan.server.api.controller.android;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class Handler implements AsyncHandler {

    private static final Logger LOGGER = LogManager.getLogger(ScanResult.class);

    @Override
    public void handleResponse(Response res) {
        LOGGER.info("HANDLING");
    }
}
