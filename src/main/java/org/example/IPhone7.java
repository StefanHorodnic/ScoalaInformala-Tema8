package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class IPhone7 extends Apple {

    private String imei;

    @Override
    public String getImei() {
        return imei;
    }

    public IPhone7() {
        this.imei = "IP7-" + UUID.randomUUID().toString();
    }
}
