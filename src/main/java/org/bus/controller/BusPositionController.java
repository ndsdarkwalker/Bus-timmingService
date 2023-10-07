package org.bus.controller;

import org.bus.response.BusPositionResponse;
import org.bus.service.BusPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus-positions")
public class BusPositionController {
    private final BusPositionService busPositionService;

    @Autowired
    public BusPositionController(BusPositionService busPositionService) {
        this.busPositionService = busPositionService;
    }

    @GetMapping("/{busLineId}")
    public BusPositionResponse getBusPositions(@PathVariable String busLineId) {
        return busPositionService.getBusPositions(busLineId);
    }
}
