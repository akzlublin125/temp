package pl.com.pko.avscan.server.api.controller.android;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.pko.avscan.client.requestbody.android.AndroidScanResultApi;
import pl.com.pko.avscan.client.requestbody.android.ScanResultRequest;
import pl.com.pko.avscan.server.api.service.android.ScanResultApiService;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class ScanResult implements AndroidScanResultApi {

    private static final Logger LOGGER = LogManager.getLogger(ScanResult.class);

    private final ScanResultApiService scanResultApiService;

    @Autowired
    public ScanResult(ScanResultApiService scanResultApiService) {
        this.scanResultApiService = scanResultApiService;
    }

    @RequestMapping(value = "/av/add", method = POST)
    public void add(@RequestBody @Valid ScanResultRequest scanResultRequest, BindingResult bindingResult) {
        LOGGER.info("Request {}", scanResultRequest);
        if(bindingResult.hasErrors()) {
            LOGGER.error(bindingResult.getAllErrors());
        }
        save(scanResultRequest);
    }

    @Override
    public void save(ScanResultRequest scanResultRequest) {
        scanResultApiService.justTest();
    }
}
