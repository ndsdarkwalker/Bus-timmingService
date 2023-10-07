package org.bus.dto;

import lombok.Data;

import java.util.List;

@Data
public class BusLine {
    private String id;
    private String fullName;
    private String origin;
    private String shortName;
    private List<BusStop> busStops;
    private List<Double[]> path;
}
