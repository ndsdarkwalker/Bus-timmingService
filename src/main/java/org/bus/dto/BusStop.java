package org.bus.dto;

import lombok.Data;

@Data
public class BusStop {
    private String id;
    private double lat;
    private double lng;
    private String name;
}
