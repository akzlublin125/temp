package pl.com.pko.avscan.client.requestbody.android;

import javax.validation.constraints.NotNull;

public class ScanResultRequest {

    @NotNull
    private String bleble;

    public String getBleble() {
        return bleble;
    }

    public void setBleble(String bleble) {
        this.bleble = bleble;
    }
}
