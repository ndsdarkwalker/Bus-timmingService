package org.bus.controller;

import org.bus.dto.BusPositionDto;
import org.bus.dto.BusStopDto;
import org.bus.service.BusStopService;
import org.bus.service.BusTimmingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bus-timing")
public class BusTimingController {

    @Autowired(required = false)
    private BusTimmingService busTimingService;

    @Autowired(required = false)
    private BusStopService busStopService;

    // TODO
//    @GetMapping("/bus-stops")
//    public ResponseEntity<BusTimmingResponse> getBusStops(String busName) {
//        BusTimmingResponse busStops = busTimingService.getBusTimming( busName);
//        return ResponseEntity.ok(busStops);
//    }

    // TODO
    @GetMapping("/bus-stops")
    public List<BusStopDto> getBusStops() {
        // Implement logic to get and return bus stops
        return new ArrayList<>();
    }

    // TODO
    @GetMapping("/running-buses/{busLineId}")
    public List<BusPositionDto> getRunningBuses(@PathVariable String busLineId) {
        // Implement logic to get and return running buses for a specific bus line
        return new ArrayList<>();
    }

    // TODO
//    @GetMapping("/estimated-arrival/{busStopId}/{busLineId}")
//    public EstimatedArrivalTime getEstimatedArrivalTime(
//            @PathVariable String busStopId,
//            @PathVariable String busLineId) {
        // Implement logic to estimate arrival time at a specific bus stop for a bus line
//    }
}
