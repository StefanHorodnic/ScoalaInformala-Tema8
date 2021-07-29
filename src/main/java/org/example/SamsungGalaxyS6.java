package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class SamsungGalaxyS6 extends Samsung {

    private String imei;

    @Override
    public String getImei() {
        return imei;
    }

    public SamsungGalaxyS6() {
        this.imei = "SG6-" + UUID.randomUUID().toString();
    }
}
