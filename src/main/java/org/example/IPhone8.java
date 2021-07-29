package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class IPhone8 extends Apple {

    private String imei;

    @Override
    public String getImei() {
        return imei;
    }

    public IPhone8() {
        this.imei = "IP8-" + UUID.randomUUID().toString();
    }
}
