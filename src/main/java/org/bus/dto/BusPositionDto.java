package org.bus.dto;

import lombok.Data;

@Data
public class BusPositionDto {
    private double bearing;
    private String crowdLevel;
    private double lat;
    private double lng;
    private String vehiclePlate;
}
