package pl.com.pko.avscan.server.api.controller.android;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.pko.avscan.client.requestbody.android.VirusSignatureApi;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class VirusSignature implements VirusSignatureApi {

    private static final Logger LOGGER = LogManager.getLogger(ScanResult.class);

    @RequestMapping(value = "/av/getSignatures", method = POST)
    public void add() {
        LOGGER.info("Request");
        read();
    }

    @Override
    public void read() {
    }
}
