package org.bus.dto;

import lombok.Data;

import java.util.List;

@Data
public class BusLineDto {
    private String id;
    private String fullName;
    private String origin;
    private String shortName;
    private List<BusStopDto> busStopDtos;
    private List<Double[]> path;
}
