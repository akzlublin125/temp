package pl.com.pko.avscan.server.api.service.android;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ScanResultApiServiceDefault implements ScanResultApiService {

    private static final Logger LOGGER = LogManager.getLogger(ScanResultApiServiceDefault.class);

    @Override
    @Async
    public void justTest() {
        LOGGER.info("async call " + Thread.currentThread().getId());
    }
}
