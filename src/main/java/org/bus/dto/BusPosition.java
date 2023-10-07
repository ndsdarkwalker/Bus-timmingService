package org.bus.dto;

import lombok.Data;

@Data
public class BusPosition {
    private double bearing;
    private String crowdLevel;
    private double lat;
    private double lng;
    private String vehiclePlate;
}
