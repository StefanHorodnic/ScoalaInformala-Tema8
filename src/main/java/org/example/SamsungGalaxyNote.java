package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class SamsungGalaxyNote extends Samsung {

    private String imei;

    @Override
    public String getImei() {
        return imei;
    }

    public SamsungGalaxyNote() {
        this.imei = "SGN-" + UUID.randomUUID().toString();
    }
}
